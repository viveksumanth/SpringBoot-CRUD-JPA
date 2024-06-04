package com.example.crudrestapisql.controllers;

import com.example.crudrestapisql.entity.Product;
import com.example.crudrestapisql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class productController {

    private final ProductService productService;

    @Autowired
    public productController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @GetMapping("/allproducts")
    public List<Product> allProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        product.setProductId(0);
        System.out.println(product);
        return productService.saveProduct(product);
    }

    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @DeleteMapping("/products/{productId}")
    public void deleteEmployee(@PathVariable int productId) {
        productService.deleteProduct(productId);
    }
}
