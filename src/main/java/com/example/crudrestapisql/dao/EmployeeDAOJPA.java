package com.example.crudrestapisql.dao;

import com.example.crudrestapisql.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJPA implements EmployeeDao {
    //define a field for entity manager
    //EntityManager is automatically created by spring boot - we inject in below constructor.
    private final EntityManager entityManager;

    @Autowired
    public EmployeeDAOJPA(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> getAllEmployees() {
        System.out.println("getAllEmployees() called");
        // create a query
        TypedQuery<Employee> getAllEmployeesQuery = entityManager.createQuery("from Employee", Employee.class);
        // execute the query
        return getAllEmployeesQuery.getResultList();
    }

    @Override
    public Employee getEmployeebyId(int id) {
        Employee foundEmployee = entityManager.find(Employee.class, id);
        if (foundEmployee == null) {
            throw new RuntimeException("Employee not found");
        }
        return foundEmployee;
    }

    @Override
    public Employee saveEmployee(Employee newEmployee) {
        return entityManager.merge(newEmployee);
    }

    @Override
    public Employee deleteEmployee(int id) {
        Employee employee = entityManager.find(Employee.class, id);
        if (employee == null) {
            throw new RuntimeException("Employee not found");
        }
        entityManager.remove(employee);
        return employee;
    }

}
