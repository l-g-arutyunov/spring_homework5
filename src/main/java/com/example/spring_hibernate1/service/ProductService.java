package com.example.spring_hibernate1.service;

import com.example.spring_hibernate1.domain.Product;
import com.example.spring_hibernate1.exception.NonFoundException;
import com.example.spring_hibernate1.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public void createProduct(@NonNull String title, int cost ) {
        productRepository.save(new Product(title, cost));
    }

    public Iterable<Product> findAllProduct() {
        return productRepository.findAll();
    }

    public String findProductById(@NonNull long id) {
        return productRepository.findById(id).orElseThrow(NonFoundException::new).toString();
    }

    public void deleteProduct(@NonNull long id) {
        productRepository.deleteById(id);
    }

}
