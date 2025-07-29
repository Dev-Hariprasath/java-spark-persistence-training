package org.revature.emp;

import java.util.Comparator;

public class Employee{

    private int Id;
    private String Name;
    private Double Salary;


    public Employee() {
    }

    public Employee(int id, Double salary, String name) {
        Id = id;
        Salary = salary;
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Salary=" + Salary +
                '}';
    }

}
