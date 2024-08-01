package com.tahsin.project.model.dto.request;

import jakarta.validation.constraints.*;

public record MerchantRequest(
        @NotNull
        String name,
        @NotBlank(message = "Email is required")
        @Email
        String email,
        @Size(min = 6, max = 25, message = "Password length must be between 6 and 25 characters")
        String password,
        @Size(min = 11, max = 11, message = "05554443322 Phone number's length must be equal to 11.")
        @Pattern(regexp = "^[0-9]+$", message = "Phone number must contain only numbers")
        String phoneNumber

) {}
