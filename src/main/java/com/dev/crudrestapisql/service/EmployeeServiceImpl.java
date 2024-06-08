package com.dev.crudrestapisql.service;

import com.dev.crudrestapisql.dao.EmployeeDao;
import com.dev.crudrestapisql.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeDao.getEmployeebyId(id);
    }

    @Override
    @Transactional
    public Employee saveEmployee(Employee employee) {
       return employeeDao.saveEmployee(employee);
    }

    @Override
    @Transactional
    public Employee deleteEmployee(int id) {
        return employeeDao.deleteEmployee(id);
    }

}
