package com.codeclan.employeetracking.components;

import com.codeclan.employeetracking.models.Employee;
import com.codeclan.employeetracking.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    EmployeeRepo employeeRepo;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        Employee employee1 = new Employee("Ted Bundy", 45, 2415, "TB@aol.com");
        Employee employee2 = new Employee("John Wayne Gasey", 50, 2351, "JWG@aol.com");
        employeeRepo.save(employee1);
        employeeRepo.save(employee2);
    }

}
