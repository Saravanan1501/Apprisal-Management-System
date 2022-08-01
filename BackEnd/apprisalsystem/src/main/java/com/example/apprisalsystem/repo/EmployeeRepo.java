package com.example.apprisalsystem.repo;

import com.example.apprisalsystem.model.Apprisal;
import com.example.apprisalsystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    Employee findByEmpId(int empId);

    @Transactional
    void deleteEmployeeById(int id);
}
