package org.revature.jdbc;

public class Employee {

    private int empId;
    private String name;
    private String dept;
    private String designation;
    private int salary;

    public Employee() {
    }

    public Employee(String name, int empId, String dept, String designation, int salary) {
        this.name = name;
        this.empId = empId;
        this.dept = dept;
        this.designation = designation;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
