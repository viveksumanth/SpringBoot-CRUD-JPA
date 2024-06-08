package com.dev.crudrestapisql.service;

import com.dev.crudrestapisql.entity.Company;

import java.util.List;
import java.util.Optional;

public interface CompanyService {

    List<Company> getAllCompanies();

    Optional<Company> getCompanyById(int id);

    Company saveCompany(Company product);

    void deleteCompany(int id);
}
