package com.dev.crudrestapisql.controllers;

import com.dev.crudrestapisql.entity.Product;
import com.dev.crudrestapisql.service.ProductService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name = "Product EndPoints", description = "Product CRUD operations")
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

    @GetMapping("/product")
    public List<Product> getProductByName(@RequestParam("productName") String productName) {
        return productService.getProductByName(productName);
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
    public void deleteProduct(@PathVariable int productId) {
        productService.deleteProduct(productId);
    }
}
