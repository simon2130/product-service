package com.ctbe.simon.dto;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductRequest {
    // Getters and Setters
    @NotBlank(message = "Name is required")
    private String name;
    @DecimalMin(value = "0.01", message = "Price must be greater than 0")
    private double price;
    @Min(value = 0, message = "Stock quantity cannot be negative")
    private int stockQty;
    @NotBlank(message = "Category is required")
    private String category;

}