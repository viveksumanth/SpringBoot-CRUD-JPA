package com.example.crudrestapisql.service;

import com.example.crudrestapisql.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Product> getAllProducts();

    Product getProductById(int id);

    Product saveProduct(Product product);

    void deleteProduct(int id);
}
