package com.tahsin.project.model.dto.request;

import java.time.LocalDateTime;
import jakarta.validation.constraints.NotNull;

public record CouponRequest(
        //check discount is between 1-100 or not
        @NotNull
        int discount,
        @NotNull
        LocalDateTime expiryDate
) {}
