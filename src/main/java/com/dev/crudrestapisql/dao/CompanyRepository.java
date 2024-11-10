package com.dev.crudrestapisql.dao;

import com.dev.crudrestapisql.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

//@RepositoryRestResource(path="companies")
public interface CompanyRepository extends JpaRepository<Company, Integer> {
}
