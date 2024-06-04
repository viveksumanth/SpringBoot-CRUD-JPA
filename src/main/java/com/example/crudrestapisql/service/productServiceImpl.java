package com.example.crudrestapisql.service;

import com.example.crudrestapisql.dao.ProductRepository;
import com.example.crudrestapisql.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class productServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public productServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(int id) {
        Optional<Product> result = productRepository.findById(id);
        Product product = null;
        if (result.isPresent()) {
            product = result.get();
        } else {
            throw new RuntimeException("Product not found with id: " + id);
        }
        return product;
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
