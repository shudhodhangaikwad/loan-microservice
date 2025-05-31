package com.jsiders.loan.dto;

import com.jsiders.loan.annotation.EnumValue;
import com.jsiders.loan.constant.LoanType;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

/**
 * Created by Sid Gaikwad on 29-05-2025.
 */
@Data
@Schema(name = "Load", description = "A model to hold loan details")
public class LoanDto {

    private Integer id;

    @NotEmpty(message = "Mobile number is required")
    private String mobileNumber;

    private String loanNumber;

    @NotEmpty(message = "LoanType is required")
    @EnumValue(enumClass = LoanType.class, message = "Allowed values: PERSONAL, HOME, BUSINESS")
    private String loanType;


    private Double amount;


    private Double amountPaid = 0.0;

    private Double outstandingAmount = 0.0;


}
