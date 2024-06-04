package com.example.crudrestapisql.dao;

import com.example.crudrestapisql.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path="companies")
public interface CompanyRepository extends JpaRepository<Company, Integer> {
}
