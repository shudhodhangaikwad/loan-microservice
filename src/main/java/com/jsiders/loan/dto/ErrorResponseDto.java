package com.jsiders.loan.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * Created by Sid Gaikwad on 29-05-2025.
 */

@Data
@Builder
public class ErrorResponseDto {

    private String message;

    private int statusCode;

    private List<String> errors;

    private String path;

}
