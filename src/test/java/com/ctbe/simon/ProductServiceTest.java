package com.ctbe.simon;

import com.ctbe.simon.dto.ProductResponse;
import com.ctbe.simon.Exception.ResourceNotFoundException;
import com.ctbe.simon.model.Product;
import com.ctbe.simon.repository.ProductRepository;
import com.ctbe.simon.service.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @Test
    void findById_returnsProductResponse_whenProductExists() {
        // Arrange
        // Note: Added stockQty (0) and category ("Electronics") to match your Product model constructor
        Product laptop = new Product("Laptop", 1200.0, 10, "Electronics");
        laptop.setId(1L);

        when(productRepository.findById(1L)).thenReturn(Optional.of(laptop));

        // Act
        // Changed type from Optional<Product> to ProductResponse
        ProductResponse result = productService.findById(1L);

        // Assert
        assertThat(result).isNotNull();
        assertThat(result.getName()).isEqualTo("Laptop");
        assertThat(result.getPrice()).isEqualTo(1200.0);
    }

    @Test
    void findById_throwsException_whenProductNotFound() {
        // Arrange
        when(productRepository.findById(99L)).thenReturn(Optional.empty());

        // Act & Assert
        // Since your service throws an exception, we must test for that exception
        assertThrows(ResourceNotFoundException.class, () -> {
            productService.findById(99L);
        });
    }
}