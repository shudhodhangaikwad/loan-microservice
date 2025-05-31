package com.jsiders.loan.dto;

import com.jsiders.loan.annotation.EnumValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import lombok.Data;
import org.springframework.data.domain.Sort;

import javax.swing.*;

/**
 * Created by Sid Gaikwad on 29-05-2025.
 */
@Data
public class PaginationRequestDto {

    @Min(1)
    private int page = 1;

    @Min(10)
    private int size = 20;

    @Schema(example = "id")
    private String sortBy = "id";

    @Schema(example = "asc", allowableValues = {"asc", "desc"})
    //@EnumValue(enumClass = Sort.Direction.class, message = "Allowed values: asc, desc")
    private String orderBy;


}
