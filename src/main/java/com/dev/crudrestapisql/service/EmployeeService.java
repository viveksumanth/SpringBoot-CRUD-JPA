package com.dev.crudrestapisql.service;

import com.dev.crudrestapisql.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    Employee getEmployeeById(int id);

    Employee saveEmployee(Employee employee);

    Employee deleteEmployee(int id);
}
