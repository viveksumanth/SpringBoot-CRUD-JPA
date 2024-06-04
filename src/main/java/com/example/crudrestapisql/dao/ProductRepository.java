package com.example.crudrestapisql.dao;

import com.example.crudrestapisql.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    // entityType: Product and primaryKey(id): Integer
}
