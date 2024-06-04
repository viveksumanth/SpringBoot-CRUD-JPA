package com.example.crudrestapisql.service;

import com.example.crudrestapisql.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    Employee getEmployeeById(int id);

    Employee saveEmployee(Employee employee);

    Employee deleteEmployee(int id);
}
