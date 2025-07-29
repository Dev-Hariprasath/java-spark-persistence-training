package org.revature.jdbc.Controller;

import org.revature.jdbc.Service.EmployeeService;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Option : ");
        int option = in.nextInt();
        EmployeeService service = new EmployeeService();

        switch (option) {
            case 1 -> service.getAllEmployee();
            case 2 -> service.getEmployeeById();
            case 3 -> service.saveEmployee();
            case 4 -> service.updateEmployee();
            case 5 -> service.deleteEmployee();
            case 6 -> service.getTotalEmployeeCount();
            case 7 -> service.getTotalDeptCount();
            case 8 -> service.getEmployeesNameInUpperCase();
            default -> System.out.println("The Option Range From 1 to 8");
        };

    }
}



