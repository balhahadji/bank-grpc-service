package org.isd.bankgrpcservice.entities;

import lombok.*;
import org.isd.bankgrpcservice.enums.TransactionStatus;
import org.isd.bankgrpcservice.enums.TransactionType;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountTransaction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long timestamp;
    private double amount;
    @Enumerated(EnumType.STRING)
    private TransactionType type;
    @Enumerated(EnumType.STRING)
    private TransactionStatus status;
    @ManyToOne
    private Account account;
}
