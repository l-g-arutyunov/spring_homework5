package com.example.spring_hibernate1.controllers;

import com.example.spring_hibernate1.domain.Product;
import com.example.spring_hibernate1.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customers")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("add")
    public void addCustomer(@RequestParam("name") String name, @RequestParam("age") int age){
        productService.createProduct(name, age);
    }

    @GetMapping("show")
    public Iterable<Product> showCustomers(){
        return productService.findAllProduct();
    }

    @GetMapping("delete/{id}")
    public void deleteCustomer(@PathVariable long id) {
        productService.deleteProduct(id);
    }

    @GetMapping("find/{id}")
    public String findById(@PathVariable long id){
        return productService.findProductById(id);
    }
}
