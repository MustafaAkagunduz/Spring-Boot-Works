package com.tahsin.project.model.dto.response;

import com.tahsin.project.model.entity.Product;
import com.tahsin.project.model.enums.AccountType;

import java.util.List;

public record MerchantResponse (
    Long id,
    String name,
    String email,
    AccountType active,
    List<Product> products
) {}
