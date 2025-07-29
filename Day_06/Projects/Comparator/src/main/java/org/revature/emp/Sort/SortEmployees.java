package org.revature.emp.Sort;

import org.revature.emp.Employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployees {

    private Comparator<Employee> comparator;
    private List<Employee> employees;

    public SortEmployees(Comparator<Employee> comparator, List<Employee> employees) {
        this.comparator = comparator;
        this.employees = employees;
        sortEmployees();
    }


    private void sortEmployees() {
        String comparatorName = comparator.getClass().getSimpleName();

        switch (comparatorName) {
            case "SortEmployeesById":
                System.out.println("The Employees List is Sorted By Id In Descending");
                break;
            case "SortEmployeesBySalary":
                System.out.println("The Employees List is Sorted By Salary");
                break;
            case "SortEmployeesByName":
                System.out.println("The Employees List is Sorted By Name");
                break;
            default:
                System.out.println("Sorting using custom comparator: " + comparatorName);
        }

        Collections.sort(employees, comparator);
        for (Employee emp : employees){
            System.out.print(emp.getId() + " - " + emp.getName() + " - " + emp.getSalary());
        }
        System.out.println();
    }
}
