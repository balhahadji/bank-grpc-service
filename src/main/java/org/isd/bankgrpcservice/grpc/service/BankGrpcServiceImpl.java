package org.isd.bankgrpcservice.grpc.service;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.isd.bankgrpcservice.entities.Account;
import org.isd.bankgrpcservice.entities.AccountTransaction;
import org.isd.bankgrpcservice.entities.Currency;
import org.isd.bankgrpcservice.enums.TransactionStatus;
import org.isd.bankgrpcservice.enums.TransactionType;
import org.isd.bankgrpcservice.grpc.stub.Bank;
import org.isd.bankgrpcservice.grpc.stub.BankServiceGrpc;
import org.isd.bankgrpcservice.mappers.BankAccountMapperImpl;
import org.isd.bankgrpcservice.repository.AccountRepository;
import org.isd.bankgrpcservice.repository.AccountTransactionRepository;
import org.isd.bankgrpcservice.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.stream.Collectors;

@GrpcService
public class BankGrpcServiceImpl extends BankServiceGrpc.BankServiceImplBase {
    @Autowired
    private CurrencyRepository currencyRepository;
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private BankAccountMapperImpl accountMapper;
    @Autowired
    private AccountTransactionRepository accountTransactionRepository;

    @Override
    public void getBankAccount(Bank.GetBankAccountRequest request, StreamObserver<Bank.GetBankAccountResponse> responseObserver) {
        String accountId = request.getAccountId();
        Account account = accountRepository.findById(accountId).orElse(null);
        if (account != null) {
            Bank.BankAccount bankAccount = accountMapper.fromBankCount(account);
            Bank.GetBankAccountResponse accountResponse = Bank.GetBankAccountResponse.newBuilder()
                    .setBankAccount(bankAccount)
                    .build();
            responseObserver.onNext(accountResponse);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void getListAccounts(Bank.GetListAccountsRequest request, StreamObserver<Bank.GetListAccountsResponse> responseObserver) {
        List<Account> accountList = accountRepository.findAll();
        List<Bank.BankAccount> grpcAccountList = accountList.stream().map(account -> accountMapper.fromBankCount(account)).collect(Collectors.toList());
        Bank.GetListAccountsResponse listAccountsResponse = Bank.GetListAccountsResponse.newBuilder()
                .addAllBankAccount(grpcAccountList)
                .build();
        responseObserver.onNext(listAccountsResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void convertCurrency(Bank.ConvertCurrencyRequest request, StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
        String from = request.getCurrencyFrom();
        String to = request.getCurrencyTo();
        double amount = request.getAmount();
        Currency currencyFrom = currencyRepository.findByName(from);
        Currency currencyTo = currencyRepository.findByName(to);
        double result = amount * currencyFrom.getPrice() / currencyTo.getPrice();
        Bank.ConvertCurrencyResponse convertCurrencyResponse = Bank.ConvertCurrencyResponse.newBuilder()
                .setCurrencyFrom(from)
                .setCurrencyTo(to)
                .setAmount(amount)
                .setConversionResult(result)
                .build();
        responseObserver.onNext(convertCurrencyResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getStreamOfTransactions(Bank.GetStreamTransactionsRequest request, StreamObserver<Bank.Transaction> responseObserver) {
        String accountId = request.getAccountId();
        List<AccountTransaction> accountTransactions = accountTransactionRepository.findByAccountId(accountId);
        if (accountTransactions.size() == 0) {
            responseObserver.onError(
                    Status.INTERNAL
                            .withDescription("No Transaction For this account " + accountId).asException());
            return;
        }
        //pile de transactions
        Stack<Bank.Transaction> transactionStack = new Stack<>();
        transactionStack.addAll(accountTransactions.stream()
                .map(accTrans -> accountMapper.fromAccountTransaction(accTrans))
                .collect(Collectors.toList()));
        Timer timer = new Timer("Timer");
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Bank.Transaction transaction = transactionStack.pop();
                responseObserver.onNext(transaction);
                if (transactionStack.empty()) {
                    responseObserver.onCompleted();
                    this.cancel();
                }
            }
        }, 0, 1000);

    }

    @Override
    public StreamObserver<Bank.Transaction> performStreamOfTransactions(StreamObserver<Bank.PerformStreamOfTransactionResponse> responseObserver) {
        List<AccountTransaction> transactionList = new ArrayList<>();


        return new StreamObserver<Bank.Transaction>() {
            @Override
            public void onNext(Bank.Transaction transaction) {

                AccountTransaction accountTransaction = accountMapper.fromGrpcTransaction(transaction);
                accountTransaction.setStatus(TransactionStatus.EXECUTED);
                Account account = accountRepository.findById(transaction.getAccountId()).orElse(null);
                if (account == null) {
                    responseObserver.onError(Status.INTERNAL.withDescription("Account Not Found").asException());
                }
                accountTransaction.setAccount(account);
                accountTransactionRepository.save(accountTransaction);
                transactionList.add(accountTransaction);
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.getMessage();
            }

            @Override
            public void onCompleted() {
                int debitTransactionCount = 0;
                int creditTransactionCount = 0;
                double totalAmountDebitTransactions = 0;
                double totalAmountCreditTransactions = 0;
                for (AccountTransaction accountTransaction : transactionList) {
                    if (accountTransaction.getType() == TransactionType.CREDIT) {
                        ++creditTransactionCount;
                        totalAmountCreditTransactions += accountTransaction.getAmount();
                    } else {
                        ++debitTransactionCount;
                        totalAmountDebitTransactions += accountTransaction.getAmount();
                    }
                }
                Bank.PerformStreamOfTransactionResponse response = Bank.PerformStreamOfTransactionResponse.newBuilder()
                        .setExecutedTransactionCount(transactionList.size())
                        .setTotalCreditTransactionsAmount(totalAmountCreditTransactions)
                        .setTotalDebitTransactionAmount(totalAmountDebitTransactions)
                        .setExecutedTransactionCount(debitTransactionCount + creditTransactionCount)
                        .setTotalTransactionAmount(totalAmountCreditTransactions + totalAmountDebitTransactions)
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<Bank.Transaction> executeStreamOfTransaction(StreamObserver<Bank.Transaction> responseObserver) {
        return new StreamObserver<Bank.Transaction>() {
            @Override
            public void onNext(Bank.Transaction transaction) {
                if (transaction.getAmount() > 100) {
                    Bank.Transaction transactionResponse = Bank.Transaction.newBuilder()
                            .setAmount(transaction.getAmount())
                            .setStatus(Bank.TransactionStatus.EXECUTED)
                            .build();
                    responseObserver.onNext(transactionResponse);
                } else {
                    //responseObserver.onError(Status.INTERNAL.withDescription("Transaction rejected").asException());
                    throw new RuntimeException("The Transaction " + transaction.getId() + " is rejected");
                }
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
