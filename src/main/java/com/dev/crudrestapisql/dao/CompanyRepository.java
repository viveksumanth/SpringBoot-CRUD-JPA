package com.dev.crudrestapisql.dao;

import com.dev.crudrestapisql.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
}
