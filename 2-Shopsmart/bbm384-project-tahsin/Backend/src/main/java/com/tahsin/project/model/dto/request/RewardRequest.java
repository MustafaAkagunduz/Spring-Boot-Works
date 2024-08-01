package com.tahsin.project.model.dto.request;

import com.tahsin.project.model.enums.RewardType;
import jakarta.validation.constraints.NotNull;

public record RewardRequest(
        @NotNull
        Long couponId,
        @NotNull
        RewardType rewardType,
        @NotNull
        int points
) {}
