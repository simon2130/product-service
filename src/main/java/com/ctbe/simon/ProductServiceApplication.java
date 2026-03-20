package com.ctbe.simon;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ctbe.simon.model.Product;
import com.ctbe.simon.repository.ProductRepository;

@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}
@Bean
CommandLineRunner seedData(ProductRepository repo){
    return args -> {
        repo.save(new Product("Laptop",1200));
        repo.save(new Product("Monitor",350));
        repo.save(new Product("Keyboard",85));
    };
}
}
