package com.example.apprisalsystem.service;


import com.example.apprisalsystem.model.Employee;
import com.example.apprisalsystem.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee findByEmpId(int empId){ return employeeRepo.findByEmpId(empId);}

    public Employee addEmployee(Employee employee){return employeeRepo.save(employee);}
    public List<Employee> findAllEmployee() {return employeeRepo.findAll();}
    public void deleteEmployee(int id){employeeRepo.deleteEmployeeById(id);}
    public Employee updateEmployee(Employee employee) {return employeeRepo.save(employee);}

    public String getPassword(int empId) {
        Employee employee = employeeRepo.findByEmpId(empId);
        return employee.getPassword();
    }
}
