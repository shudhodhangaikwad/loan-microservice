package com.jsiders.loan.controller;

import com.jsiders.loan.dto.LoanDto;
import com.jsiders.loan.dto.PaginationRequestDto;
import com.jsiders.loan.dto.PaginationResponseDto;
import com.jsiders.loan.service.ILoanService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Sid Gaikwad on 29-05-2025.
 */
@RestController
@AllArgsConstructor
@Tag(name = "Loan")
@Validated
@RequestMapping("/api/loan")
public class LoanController {

    private final ILoanService loanService;

    @Operation(
            summary = "List all loans",
            description = "List of all the loans"
    )

    @GetMapping
    public ResponseEntity<PaginationResponseDto> findAll(@ParameterObject @Valid @ModelAttribute PaginationRequestDto requestDto) {
        return ResponseEntity.status(HttpStatus.OK).body(loanService.getAllLoan(requestDto));
    }


    @PostMapping
    public ResponseEntity<LoanDto> createLoan(@RequestBody @Valid LoanDto loanDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(loanService.createLoan(loanDto));
    }


}
