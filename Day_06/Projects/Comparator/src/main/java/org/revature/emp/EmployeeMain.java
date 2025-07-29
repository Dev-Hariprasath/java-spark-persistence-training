package org.revature.emp;

import org.revature.emp.Sort.SortEmployees;
import org.revature.emp.Sort.SortEmployeesById;
import org.revature.emp.Sort.SortEmployeesByName;
import org.revature.emp.Sort.SortEmployeesBySalary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, 10000.00, "Hari"));
        employees.add(new Employee(2, 20000.00, "Maran"));
        employees.add(new Employee(3, 18000.00, "Dhivya"));
        employees.add(new Employee(4, 12000.00, "Abi"));
        employees.add(new Employee(5, 16000.00, "Ram"));

        System.out.println("The Employee List is : ");
        System.out.println(employees);
        System.out.println();


        Comparator ComparatorById = new SortEmployeesById();
        Comparator ComparatorBySalary  = new SortEmployeesBySalary();
        Comparator ComparatorByName = new SortEmployeesByName();


        SortEmployees sortEmployeesById = new SortEmployees(ComparatorById, employees);
        SortEmployees sortEmployeesBySalary = new SortEmployees(ComparatorBySalary, employees);
        SortEmployees sortEmployeesByName = new SortEmployees(ComparatorByName, employees);


    }


}