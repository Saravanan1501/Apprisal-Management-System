package com.example.apprisalsystem.model;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;
    private int empId;
    private String empName;
    private String email;
    private String phone;
    private String doj;
    private String address;
    private String password;
    private String reportingOfficer;
    private String role;

    public Employee() {}

    public Employee(int empId, String empName, String email, String phone, String doj, String address, String password, String reportingOfficer, String role) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.phone = phone;
        this.doj = doj;
        this.address = address;
        this.password = password;
        this.reportingOfficer = reportingOfficer;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getReportingOfficer() {
        return reportingOfficer;
    }

    public void setReportingOfficer(String reportingOfficer) {
        this.reportingOfficer = reportingOfficer;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empId=" + empId +
                ", empName='" + empName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", doj='" + doj + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", reportingOfficer='" + reportingOfficer + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
