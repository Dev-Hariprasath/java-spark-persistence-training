package org.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, 10000.00, "Hari"));
        employees.add(new Employee(2, 20000.00, "Maran"));
        employees.add(new Employee(3, 18000.00, "Dhivya"));
        employees.add(new Employee(4, 12000.00, "Abi"));
        employees.add(new Employee(5, 16000.00, "Ram"));

        System.out.println("By Comparable :");

        System.out.println("The Employee List Before Sort : ");
        System.out.println(employees);

        System.out.println();

        System.out.println("After Sort ");
        Collections.sort(employees);
        System.out.println(employees);

    }
}