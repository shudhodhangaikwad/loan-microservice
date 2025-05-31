package com.jsiders.loan.mapper;

import com.jsiders.loan.constant.LoanType;
import com.jsiders.loan.dto.LoanDto;
import com.jsiders.loan.entity.Loan;

/**
 * Created by Sid Gaikwad on 29-05-2025.
 */

public class LoanMapper {


    private LoanMapper() {
    }


    public static Loan mapToLoan(LoanDto loanDto, Loan loan) {
        loan.setId(loanDto.getId());
        loan.setMobileNumber(loanDto.getMobileNumber());
        loan.setAmount(loanDto.getAmount());
        loan.setLoanType(LoanType.valueOf(loanDto.getLoanType()));
        loan.setAmountPaid(loanDto.getAmountPaid());
        loan.setOutstandingAmount(loanDto.getOutstandingAmount());
        loan.setLoanNumber(loanDto.getLoanNumber());
        return loan;
    }

    public static LoanDto mapToLoanDto(Loan loan, LoanDto loanDto) {
        loanDto.setId(loan.getId());
        loanDto.setMobileNumber(loan.getMobileNumber());
        loanDto.setAmount(loan.getAmount());
        loanDto.setLoanType(loan.getLoanType().name());
        loanDto.setAmountPaid(loan.getAmountPaid());
        loanDto.setOutstandingAmount(loan.getOutstandingAmount());
        loanDto.setLoanNumber(loan.getLoanNumber());
        return loanDto;
    }

}
