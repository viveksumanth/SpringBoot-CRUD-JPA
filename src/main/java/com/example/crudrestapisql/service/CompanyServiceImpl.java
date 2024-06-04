package com.example.crudrestapisql.service;

import com.example.crudrestapisql.dao.CompanyRepository;
import com.example.crudrestapisql.entity.Company;

import java.util.List;
import java.util.Optional;

public class CompanyServiceImpl implements CompanyService {
    CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Optional<Company> getCompanyById(int id) {
        return companyRepository.findById(id);
    }

    @Override
    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public void deleteCompany(int id) {
        companyRepository.deleteById(id);
    }
}
