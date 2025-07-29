package org.revature.jdbc.Service;

import org.revature.jdbc.DAO.EmployeeDAO;
import org.revature.jdbc.Model.Employee;

import java.util.Scanner;

public class EmployeeService implements Service {

    EmployeeDAO dao = new EmployeeDAO();
    Scanner sc = new Scanner(System.in);

    @Override
    public void getAllEmployee() {
        dao.getAllEmployee();
    }

    @Override
    public void getEmployeeById() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        dao.getEmployeeById(id);
    }

    @Override
    public void saveEmployee() {
        System.out.println("Enter the New Employee Details :");
        dao.saveEmployee(readEmployeeDetails());
    }

    @Override
    public void updateEmployee() {
        System.out.println("Enter the Details of Employee to be Updated :");
        dao.updateEmployee(readEmployeeDetails());
    }

    @Override
    public void deleteEmployee() {
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();
        dao.deleteEmployee(id);
    }

    @Override
    public void getTotalEmployeeCount() {
        System.out.println("The Count of Total Employee in Office is ");
        dao.getTotalEmployeeCount();
    }

    @Override
    public void getTotalDeptCount() {
        System.out.println("The Department Count is");
        dao.getTotalDeptCount();
    }

    @Override
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
