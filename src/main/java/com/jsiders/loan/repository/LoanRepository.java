package com.jsiders.loan.repository;

import com.jsiders.loan.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Sid Gaikwad on 29-05-2025.
 */
@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
}
