package com.dev.crudrestapisql.dao;

import com.dev.crudrestapisql.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    // entityType: Product and primaryKey(id): Integer
    @Query("SELECT p FROM Product p WHERE p.productName = :productName")
    List<Product> getProductByName(String productName);
}
