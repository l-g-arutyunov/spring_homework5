package com.example.spring_hibernate1.repository;

import com.example.spring_hibernate1.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
