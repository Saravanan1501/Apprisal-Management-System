package com.example.apprisalsystem.model;


import javax.persistence.*;

@Entity
public class Apprisal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;
    private int empId;
    private int yearOfApprisal;
    private int point;
    private String reportingOfficer;
    private String status;


    public Apprisal() {}

    public Apprisal(int id, int empId, int yearOfApprisal, int point, String reportingOfficer, String status) {
        this.id = id;
        this.empId = empId;
        this.yearOfApprisal = yearOfApprisal;
        this.point = point;
        this.reportingOfficer = reportingOfficer;
        this.status = status;
    }

//    TODO: This line is not added in the employee section
    public Apprisal(int empId) {
        this.empId = empId;
    };

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYearOfApprisal() {
        return yearOfApprisal;
    }

    public void setYearOfApprisal(int yearOfApprisal) {
        this.yearOfApprisal = yearOfApprisal;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getReportingOfficer() {
        return reportingOfficer;
    }

    public void setReportingOfficer(String reportingOfficer) {
        this.reportingOfficer = reportingOfficer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Apprisal{" +
                "id=" + id +
                ", empId=" + empId +
                ", yearOfApprisal=" + yearOfApprisal +
                ", point=" + point +
                ", reportingOfficer='" + reportingOfficer + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

}



