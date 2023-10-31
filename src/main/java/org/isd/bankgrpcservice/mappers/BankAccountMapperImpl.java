package org.isd.bankgrpcservice.mappers;

import io.grpc.netty.shaded.io.netty.util.AbstractReferenceCounted;
import org.isd.bankgrpcservice.entities.Account;
import org.isd.bankgrpcservice.entities.AccountTransaction;
import org.isd.bankgrpcservice.enums.AccountStatus;
import org.isd.bankgrpcservice.enums.AccountType;
import org.isd.bankgrpcservice.enums.TransactionStatus;
import org.isd.bankgrpcservice.enums.TransactionType;
import org.isd.bankgrpcservice.grpc.stub.Bank;
import org.springframework.stereotype.Service;

@Service
public class BankAccountMapperImpl {
    public Bank.BankAccount fromBankCount(Account account) {
        Bank.BankAccount bankAccount = Bank.BankAccount.newBuilder()
                .setAccountId(account.getId())
                .setBalance(account.getBalance())
                .setCreatedAt(account.getCreateAt())
                .setType(Bank.AccountType.valueOf(account.getType().toString()))
                .setState(Bank.AccountState.valueOf(account.getStatus().toString()))
                .build();
        return bankAccount;
    }

    public Account fromGrpcAccount(Bank.BankAccount bankAccount) {
        Account account = new Account();
        account.setId(bankAccount.getAccountId());
        account.setBalance(bankAccount.getBalance());
        account.setCreateAt(bankAccount.getCreatedAt());
        account.setType(AccountType.valueOf(bankAccount.getType().toString()));
        account.setStatus(AccountStatus.valueOf(bankAccount.getState().toString()));
        return account;
    }

    public Bank.Transaction fromAccountTransaction(AccountTransaction accountTransaction) {
        Bank.Transaction transaction = Bank.Transaction.newBuilder()
                .setId(accountTransaction.getId())
                .setTimestamp(accountTransaction.getTimestamp())
                .setAccountId(accountTransaction.getAccount().getId())
                .setAmount(accountTransaction.getAmount())
                .setType(Bank.TransactionType.valueOf(accountTransaction.getType().toString()))
                .setStatus(Bank.TransactionStatus.valueOf(accountTransaction.getStatus().toString()))
                .build();
        return transaction;
    }

    public AccountTransaction fromGrpcTransaction(Bank.Transaction transaction) {
        AccountTransaction accountTransaction = new AccountTransaction();
        accountTransaction.setId(transaction.getId());
        accountTransaction.setTimestamp(transaction.getTimestamp());
        accountTransaction.setStatus(TransactionStatus.valueOf(transaction.getStatus().toString()));
        accountTransaction.setType(TransactionType.valueOf(transaction.getType().toString()));
        accountTransaction.setAmount(transaction.getAmount());
        Account account = new Account();
        account.setId(transaction.getAccountId());
        accountTransaction.setAccount(account);
        return accountTransaction;

    }
}
