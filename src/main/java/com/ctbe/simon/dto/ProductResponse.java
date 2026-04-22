package com.ctbe.simon.dto;

import lombok.Getter;

@Getter
public class ProductResponse {
    // Getters
    private Long id;
    private String name;
    private double price;
    private int stockQty;
    private String category;

    public ProductResponse() {
    }

    public ProductResponse(Long id, String name, double price,
                           int stockQty, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stockQty = stockQty;
        this.category = category;
    }

}
