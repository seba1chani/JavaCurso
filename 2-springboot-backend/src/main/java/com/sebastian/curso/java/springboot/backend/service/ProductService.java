package com.sebastian.curso.java.springboot.backend.service;

import com.sebastian.curso.java.springboot.backend.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product>finAll();
    Optional<Product>findById(Long id);
    Product save(Product product);
    Optional<Product> deleteById(Long id);
}
