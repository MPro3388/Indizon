package com.indizon.indizon.web;

import org.springframework.stereotype.Service;

@Service
public class ProductTransformer {

    public Product transformEntity(Product product) {
        return new Product(
                product.getId(),
                product.getName(),
                product.getPrice());
    }

    ;
}
