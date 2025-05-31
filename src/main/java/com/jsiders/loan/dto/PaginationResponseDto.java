package com.jsiders.loan.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Sid Gaikwad on 29-05-2025.
 */
@Data
@Builder
public class PaginationResponseDto<T> implements Serializable {

    private List<T> data;
    private long total;

}
