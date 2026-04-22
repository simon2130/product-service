package com.ctbe.simon.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "products")
public class Product {
    // ── Getters & Setters (omit Lombok for clarity) ───────────
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Name is required")
    @Column(nullable = false)
    private String name;
    @DecimalMin(value = "0.01", message = "Price must be greater than 0")
    @Column(nullable = false)
    private double price;
    @Min(value = 0, message = "Stock quantity cannot be negative")
    private int stockQty;
    @NotBlank(message = "Category is required")
    private String category;
    // ── Constructors ──────────────────────────────────────────
    public Product() {}
    public Product(String name, double price, int stockQty, String category) {
        this.name = name;
        this.price = price;
        this.stockQty = stockQty;
        this.category = category;
    }
}