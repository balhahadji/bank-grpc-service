package org.isd.bankgrpcservice;

import org.isd.bankgrpcservice.entities.Account;
import org.isd.bankgrpcservice.entities.AccountTransaction;
import org.isd.bankgrpcservice.entities.Currency;
import org.isd.bankgrpcservice.enums.AccountStatus;
import org.isd.bankgrpcservice.enums.AccountType;
import org.isd.bankgrpcservice.enums.TransactionStatus;
import org.isd.bankgrpcservice.enums.TransactionType;
import org.isd.bankgrpcservice.repository.AccountRepository;
import org.isd.bankgrpcservice.repository.AccountTransactionRepository;
import org.isd.bankgrpcservice.repository.CurrencyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

@SpringBootApplication
public class BankGrpcServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankGrpcServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CurrencyRepository currencyRepository, AccountRepository accountRepository, AccountTransactionRepository accountTransactionRepository) {
        return args -> {
            //currencyRepository.save(new Currency(null,"USD","$",1));
            currencyRepository.save(Currency.builder().name("USD").symbol("$").price(1).build());
            currencyRepository.save(Currency.builder().name("MAD").symbol("DH").price(0.1).build());
            currencyRepository.save(Currency.builder().name("EUR").symbol("EUR").price(0.98).build());
            currencyRepository.findAll().forEach(currency -> {
                System.out.println(currency.toString());
            });
            List<Currency> currencyList = currencyRepository.findAll();
            for (int i = 1; i < 10; i++) {
                Account account = Account.builder()
                        .id("CC" + i)
                        .currency(currencyList.get(new Random().nextInt(currencyList.size())))
                        .createAt(System.currentTimeMillis())
                        .balance(Math.random() * 9000000)
                        .type(Math.random() > 0.5 ? AccountType.CURRENT_ACCOUNT : AccountType.SAVING_ACCOUNT)
                        .status(AccountStatus.CREATED)
                        .build();
                accountRepository.save(account);
            }
            List<Account> accountList = accountRepository.findAll();
            accountList.forEach(account -> {
                for (int i = 0; i < 20; i++) {
                    AccountTransaction accountTransaction = AccountTransaction.builder()
                            .amount(Math.random() * 90000)
                            .timestamp(System.currentTimeMillis())
                            .type(Math.random() > 0.5 ? TransactionType.DEBIT : TransactionType.CREDIT)
                            .account(account)
                            .status(TransactionStatus.PENDING)
                            .build();
                    accountTransactionRepository.save(accountTransaction);
                }
            });
        };
    }

}
