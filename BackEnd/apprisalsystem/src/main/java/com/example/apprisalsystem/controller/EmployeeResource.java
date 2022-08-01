package com.example.apprisalsystem.controller;


import com.example.apprisalsystem.model.Apprisal;
import com.example.apprisalsystem.model.Employee;
import com.example.apprisalsystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {

    private final EmployeeService employeeService;


    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployee() {
        List<Employee> employees = employeeService.findAllEmployee();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/password/{empId}")
    public ResponseEntity<Employee> getPassword(@PathVariable("empId") int empId) {
        Employee employee = employeeService.findByEmpId(empId);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee new_employee = employeeService.addEmployee(employee);
        return new ResponseEntity<>(new_employee, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteApprisal(@PathVariable("id") int id) {
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> updateApprisal(@RequestBody Employee employee) {
        Employee new_employee = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(new_employee, HttpStatus.OK);
    }

}
