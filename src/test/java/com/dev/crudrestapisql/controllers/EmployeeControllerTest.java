package com.dev.crudrestapisql.controllers;

import com.dev.crudrestapisql.entity.Employee;
import com.dev.crudrestapisql.service.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

class EmployeeControllerTest {

    @Mock
    EmployeeService employeeService;

    @InjectMocks
    EmployeeController employeeController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    void getEmployeeById() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("firstName");
        employee.setLastName("lastName");
        employee.setAge(10);
        employee.setGender("gender");
        employee.setRole("role");

        when(employeeService.getEmployeeById(1)).thenReturn(employee);
        Employee result = employeeController.getEmployeeById(1);
        assertNotNull(result);
        assertEquals(result, employee);
    }

    @Test
    void allEmployees() {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        when(employeeService.getAllEmployees()).thenReturn(List.of(employee2, employee1));

        List<Employee> result = employeeController.allEmployees();
        assertNotNull(result);
        assertEquals(result.size(), 2);
    }

    @Test
    void addEmployee() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("firstName");
        employee.setLastName("lastName");
        employee.setAge(10);
        employee.setGender("gender");
        employee.setRole("role");
        when(employeeService.saveEmployee(employee)).thenReturn(employee);
        Employee result = employeeController.addEmployee(employee);
        assertNotNull(result);
        assertEquals(result, employee);
    }

    @Test
    void updateEmployee() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("firstName");
        employee.setLastName("lastName");
        employee.setAge(10);
        employee.setGender("gender");
        employee.setRole("role");
        when(employeeService.saveEmployee(employee)).thenReturn(employee);
        Employee result = employeeController.updateEmployee(employee);
        assertNotNull(result);
        assertEquals(result, employee);
    }

    @Test
    void deleteEmployee() {
        when(employeeService.deleteEmployee(1)).thenReturn(new Employee());
        Employee result = employeeController.deleteEmployee(1);
        assertNotNull(result);
        assertEquals(result, new Employee());
    }
}