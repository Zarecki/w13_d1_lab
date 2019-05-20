package com.codeclan.employeetracking.controller;


import com.codeclan.employeetracking.models.Employee;
import com.codeclan.employeetracking.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepo employeeRepo;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepo.findAll();
    }
}
