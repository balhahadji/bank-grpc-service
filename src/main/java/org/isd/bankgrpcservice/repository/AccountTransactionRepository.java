package org.isd.bankgrpcservice.repository;

import org.isd.bankgrpcservice.entities.Account;
import org.isd.bankgrpcservice.entities.AccountTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountTransactionRepository extends JpaRepository<AccountTransaction, Long> {
    List<AccountTransaction> findByAccountId(String id);
}
