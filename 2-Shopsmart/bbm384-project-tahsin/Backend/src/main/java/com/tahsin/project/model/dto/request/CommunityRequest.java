package com.tahsin.project.model.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record CommunityRequest(
        @NotNull
        String name,
        @Size(max = 400, message = "Description length must shorter than 400 characters")        
        String description
) {}
