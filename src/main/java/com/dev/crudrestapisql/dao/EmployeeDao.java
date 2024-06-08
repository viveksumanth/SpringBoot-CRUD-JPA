package com.dev.crudrestapisql.dao;

import com.dev.crudrestapisql.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> getAllEmployees();

    Employee getEmployeebyId(int id);

    Employee saveEmployee(Employee employee);

    Employee deleteEmployee(int id);
}
