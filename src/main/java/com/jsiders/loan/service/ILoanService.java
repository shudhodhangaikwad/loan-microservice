package com.jsiders.loan.service;

import com.jsiders.loan.dto.LoanDto;
import com.jsiders.loan.dto.PaginationRequestDto;
import com.jsiders.loan.dto.PaginationResponseDto;

import java.util.List;


/**
 * Created by Sid Gaikwad on 29-05-2025.
 */

public interface ILoanService {

    LoanDto createLoan(LoanDto loanDto);

    LoanDto updateLoan(LoanDto loanDto);

    LoanDto getLoanById(Integer loanId);

    PaginationResponseDto getAllLoan(PaginationRequestDto requestDto);

    void deleteLoan(Integer loanId);


}
