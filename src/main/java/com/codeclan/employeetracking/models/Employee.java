package com.codeclan.employeetracking.models;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Column(name = "name")
    private String Name;

    @Column(name = "age")
    private int age;

    @Column(name = "employee_number")
    private int employeeNumber;

    @Column(name = "email")
    private String email;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Employee(String name, int age, int employeeNumber, String email) {
        Name = name;
        this.age = age;
        this.employeeNumber = employeeNumber;
        this.email = email;
        this.id = id;
    }

    public Employee(){

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
