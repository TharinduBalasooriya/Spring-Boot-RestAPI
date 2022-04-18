package com.example.restapi.service;

import com.example.restapi.model.Employee;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployee();
    Employee getEmployeeById(int id);
    Employee updateEmployee(Employee employee, int id);
    void deleteEmployee(int id);
    List<String> getAllFirstNames();

}
