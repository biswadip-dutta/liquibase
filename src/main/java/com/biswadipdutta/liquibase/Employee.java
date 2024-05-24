package com.biswadipdutta.liquibase;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Table(value = "employee")
public class Employee {
    @Id
    private Long id;
    private String name;
    private String phone;
    private String email;
    private String designation;
    private String manager;
    private String department;
    private double salary;
}
