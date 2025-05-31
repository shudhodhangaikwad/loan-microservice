package com.jsiders.loan.service.impl;

import com.jsiders.loan.dto.LoanDto;
import com.jsiders.loan.dto.PaginationRequestDto;
import com.jsiders.loan.dto.PaginationResponseDto;
import com.jsiders.loan.entity.Loan;
import com.jsiders.loan.mapper.LoanMapper;
import com.jsiders.loan.repository.LoanRepository;
import com.jsiders.loan.service.ILoanService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.stream.Collectors;

/**
 * Created by Sid Gaikwad on 29-05-2025.
 */
@Service
@AllArgsConstructor
public class LoanServiceImpl implements ILoanService {


    private LoanRepository loanRepository;

    @Override
    public LoanDto createLoan(LoanDto loanDto) {
        Random random = new Random();
        int accountNumber = 10000000 + random.nextInt(90000000); // Ensures 8 digits

        Loan loan = LoanMapper.mapToLoan(loanDto, new Loan());
        loan.setLoanNumber("PA" + accountNumber);
        loan = loanRepository.save(loan);
        return LoanMapper.mapToLoanDto(loan, new LoanDto());
    }

    @Override
    public LoanDto updateLoan(LoanDto loanDto) {
        return null;
    }

    @Override
    public LoanDto getLoanById(Integer loanId) {
        return null;
    }

    @Override
    public PaginationResponseDto getAllLoan(PaginationRequestDto requestDto) {

        Pageable pageable = PageRequest.of(requestDto.getPage() - 1, requestDto.getSize(), Sort.Direction.DESC, requestDto.getSortBy());
        var page = loanRepository.findAll(pageable);
        return PaginationResponseDto.builder()
                .total(page.getTotalElements())
                .data(page.getContent().stream().map(loan -> LoanMapper.mapToLoanDto(loan, new LoanDto())).collect(Collectors.toList()))
                .build();
    }

    @Override
    public void deleteLoan(Integer loanId) {

    }
}
