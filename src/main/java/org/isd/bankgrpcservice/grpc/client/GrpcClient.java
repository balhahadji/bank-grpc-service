package org.isd.bankgrpcservice.grpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.isd.bankgrpcservice.grpc.stub.Bank;
import org.isd.bankgrpcservice.grpc.stub.BankServiceGrpc;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class GrpcClient {
    public static void main(String[] args) throws IOException {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 8888)
                .usePlaintext()
                .build();
        BankServiceGrpc.BankServiceBlockingStub blockingStub = BankServiceGrpc.newBlockingStub(managedChannel);
        Bank.ConvertCurrencyRequest.Builder builder = Bank.ConvertCurrencyRequest.newBuilder();
        builder.setCurrencyFrom("USD");
        builder.setCurrencyTo("MAD");
        builder.setAmount(98000);
        Bank.ConvertCurrencyRequest currencyRequest = builder.build();
        Bank.ConvertCurrencyResponse convertCurrencyResponse = blockingStub.convertCurrency(currencyRequest);
        System.out.println("*************************");
        System.out.println(String.format("%f en %s => %f en %s",
                convertCurrencyResponse.getAmount(), convertCurrencyResponse.getCurrencyFrom(),
                convertCurrencyResponse.getConversionResult(), convertCurrencyResponse.getCurrencyTo()));
        System.out.println("************************");

        BankServiceGrpc.BankServiceStub bankServiceStub = BankServiceGrpc.newStub(managedChannel);
        bankServiceStub.convertCurrency(currencyRequest, new StreamObserver<Bank.ConvertCurrencyResponse>() {
            @Override
            public void onNext(Bank.ConvertCurrencyResponse response) {
                System.out.println("===========================");
                System.out.println(String.format("%f en %s => %f en %s",
                        response.getAmount(), response.getCurrencyFrom(),
                        response.getConversionResult(), response.getCurrencyTo()));
                System.out.println("===============================");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Exchange end");
            }
        });
        Bank.GetStreamTransactionsRequest request = Bank.GetStreamTransactionsRequest.newBuilder()
                .setAccountId("CC7")
                .build();
        bankServiceStub.getStreamOfTransactions(request, new StreamObserver<Bank.Transaction>() {
            @Override
            public void onNext(Bank.Transaction transaction) {
                System.out.println("************************ New Transaction");
                System.out.println(transaction.getAccountId());
                System.out.println(transaction.getAmount());
                System.out.println(transaction.getType());
                System.out.println(transaction.getStatus());
                System.out.println("************************");
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                System.out.println("End");
            }
        });
        StreamObserver<Bank.Transaction> transactionStreamObserver = bankServiceStub.performStreamOfTransactions(new StreamObserver<Bank.PerformStreamOfTransactionResponse>() {
            @Override
            public void onNext(Bank.PerformStreamOfTransactionResponse performStreamOfTransactionResponse) {
                System.out.println("111------------------------------------------111");
                System.out.println(performStreamOfTransactionResponse.getTotalCreditTransactionsAmount());
                System.out.println(performStreamOfTransactionResponse.getTotalDebitTransactionAmount());
                System.out.println("222------------------------------------------222");
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.getMessage();
            }

            @Override
            public void onCompleted() {
                System.out.println("End 666666666666666666");
            }
        });
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            int counter = 0;

            @Override
            public void run() {
                ++counter;
                Bank.Transaction transaction = Bank.Transaction.newBuilder()
                        .setAmount(Math.random() * 90000)
                        .setStatus(Bank.TransactionStatus.PENDING)
                        .setType(Math.random() > 0.5 ? Bank.TransactionType.CREDIT : Bank.TransactionType.DEBIT)
                        .setAccountId("CC4")
                        .build();
                transactionStreamObserver.onNext(transaction);
                if (counter > 10) {
                    transactionStreamObserver.onCompleted();
                    timer.cancel();
                }

            }
        }, 0, 1000);
        StreamObserver<Bank.Transaction> transactionStreamObserver1 = bankServiceStub.executeStreamOfTransaction(new StreamObserver<Bank.Transaction>() {
            @Override
            public void onNext(Bank.Transaction transaction) {
                System.out.println("777------------------------------------------777");
                System.out.println(transaction.getStatus());
                System.out.println(transaction.getAmount());
                System.out.println("9999------------------------------------------999");
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.getMessage();
            }

            @Override
            public void onCompleted() {
                System.out.println("End-555555555");
            }

        });
        Timer timer1 = new Timer();
        timer1.schedule(new TimerTask() {
            int counter1 = 0;

            @Override
            public void run() {
                ++counter1;
                Bank.Transaction transaction = Bank.Transaction.newBuilder()
                        .setAmount(Math.random() * 90000)
                        .setStatus(Bank.TransactionStatus.PENDING)
                        .setType(Math.random() > 0.5 ? Bank.TransactionType.CREDIT : Bank.TransactionType.DEBIT)
                        .setAccountId("CC4")
                        .build();
                transactionStreamObserver1.onNext(transaction);
                if (counter1 > 10) {
                    transactionStreamObserver1.onCompleted();
                    timer1.cancel();
                }

            }
        }, 0, 1000);
        System.in.read();
    }

}
