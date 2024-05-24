package com.biswadipdutta.liquibase;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeRepo employeeRepo;

    @PostMapping("/create")
    public boolean addEmployee(@RequestBody Employee employee) {
        employeeRepo.save(employee);
        return true;
    }

    @PostMapping("/createmultiple")
    public boolean addMultipleEmployee(@RequestBody List<Employee> employees) {
        employeeRepo.saveAll(employees);
        return true;
    }

    @GetMapping("/get")
    public Employee getEmployee(@RequestParam String name) {
        return employeeRepo.findByName(name);
    }

    @GetMapping("/getAll")
    public List<Employee> getEmployees() {
        return employeeRepo.findAll();
    }
}
