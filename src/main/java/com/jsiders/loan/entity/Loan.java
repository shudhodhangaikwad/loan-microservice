package com.jsiders.loan.entity;

import com.jsiders.loan.constant.LoanType;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by Sid Gaikwad on 29-05-2025.
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "loans")
@Tag(name = "Loan", description = "CRUD Operation on loan.")
public class Loan extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "mobile_number", nullable = false, length = 10)
    private String mobileNumber;

    @Column(name = "loan_number", length = 100, nullable = false)
    private String loanNumber;

    @Column(name = "loan_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private LoanType loanType;

    @Column(nullable = false, updatable = false)
    private Double amount;

    @Column(nullable = false, name = "amount_paid")
    private Double amountPaid;

    @Column(nullable = false, name = "outstanding_amt")
    private Double outstandingAmount;


}
