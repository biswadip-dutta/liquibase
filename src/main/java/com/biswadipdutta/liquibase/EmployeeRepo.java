package com.biswadipdutta.liquibase;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {
    Employee findByName(String name);
    List<Employee> findAll();
}
