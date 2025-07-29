package org.revature.jdbc;

import java.util.Scanner;

public class EmployeeService {

    EmployeeDAO dao = new EmployeeDAO();
    Scanner sc = new Scanner(System.in);

    public void getAllEmployee() {
        dao.getAllEmployee();
    }

    public void getEmployeeById() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        dao.getEmployeeById(id);
    }

    public void saveEmployee() {
        System.out.println("Enter the New Employee Details :");
        dao.saveEmployee(readEmployeeDetails());
    }

    public void updateEmployee() {
        System.out.println("Enter the Details of Employee to be Updated :");
        dao.updateEmployee(readEmployeeDetails());
    }

    public void deleteEmployee() {
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();
        dao.deleteEmployee(id);
    }

    public void getTotalEmployeeCount() {
        System.out.println("The Count of Total Employee in Office is ");
        dao.getTotalEmployeeCount();
    }

    public void getTotalDeptCount() {
        System.out.println("The Department Count is");
        dao.getTotalDeptCount();
    }

    public void getEmployeesNameInUpperCase() {
        System.out.println("The Employees Name are :");
        dao.getEmployeesNameInUpperCase();
    }

    public Employee readEmployeeDetails() {
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();

        System.out.print("Enter Salary: ");
        int salary = sc.nextInt();

        return new Employee(name, empId, dept, designation, salary);
    }
}
