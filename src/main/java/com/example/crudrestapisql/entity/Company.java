package com.example.crudrestapisql.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="companies_info")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id")
    private int companyId;

    @Column(name = "company_name")
    private String companyName;

    @Override
    public String toString() {
        return "Company {" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
