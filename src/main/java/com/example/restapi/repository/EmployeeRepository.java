package com.example.restapi.repository;

import com.example.restapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query(value = "select first_name from employee",nativeQuery = true)
    List<String> getAllFirstNames();
}
