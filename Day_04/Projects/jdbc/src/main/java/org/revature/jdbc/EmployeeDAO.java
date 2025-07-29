package org.revature.jdbc;

import java.sql.*;

public class EmployeeDAO {

    String url = "jdbc:mysql://localhost:3306/day_03";
    String username = "root";
    String password = "123456789";

    public void getAllEmployee() {
        String sql = "SELECT * FROM EMPLOYEE ORDER BY id";

        try (Connection con = DriverManager.getConnection(url, username, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " - " +
                                rs.getString("empName") + " - " +
                                rs.getInt("Salary") + " - " +
                                rs.getString("Des") + " - " +
                                rs.getString("Dept")
                );
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void getEmployeeById(int id) {
        String sql = "SELECT * FROM EMPLOYEE WHERE id = ?";

        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    System.out.println(
                            rs.getInt("id") + " - " +
                                    rs.getString("empName") + " - " +
                                    rs.getInt("Salary") + " - " +
                                    rs.getString("Des") + " - " +
                                    rs.getString("Dept")
                    );
                } else {
                    System.out.println("No employee found with ID: " + id);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveEmployee(Employee employee) {
        String call = "{CALL create_emp(?, ?, ?, ?, ?)}";

        try (Connection con = DriverManager.getConnection(url, username, password);
             CallableStatement cs = con.prepareCall(call)) {

            cs.setInt(1, employee.getEmpId());
            cs.setString(2, employee.getName());
            cs.setString(3, employee.getDept());
            cs.setString(4, employee.getDesignation());
            cs.setInt(5, employee.getSalary());

            cs.execute();
            System.out.println("Employee saved successfully via stored procedure.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateEmployee(Employee employee) {
        String sql = "UPDATE EMPLOYEE SET empName = ?, Dept = ?, Des = ?, Salary = ? WHERE id = ?";

        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, employee.getName());
            ps.setString(2, employee.getDept());
            ps.setString(3, employee.getDesignation());
            ps.setInt(4, employee.getSalary());
            ps.setInt(5, employee.getEmpId());

            ps.executeUpdate();
            System.out.println("Employee updated successfully.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteEmployee(int id) {
        String sql = "DELETE FROM EMPLOYEE WHERE id = ?";

        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Employee deleted successfully.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void getTotalEmployeeCount() {
        String sql = "SELECT COUNT(*) FROM EMPLOYEE";

        try (Connection con = DriverManager.getConnection(url, username, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            if (rs.next()) {
                int count = rs.getInt(1);
                System.out.println("Total number of employees: " + count);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void getTotalDeptCount() {
        String sql = "SELECT COUNT(DISTINCT Dept) FROM EMPLOYEE";

        try (Connection con = DriverManager.getConnection(url, username, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            if (rs.next()) {
                int count = rs.getInt(1);
                System.out.println("Total number of departments: " + count);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void getEmployeesNameInUpperCase() {
        String sql = "SELECT getUpperName(empName) AS upperName FROM employee;";

        try (Connection con = DriverManager.getConnection(url, username, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(rs.getString("upperName"));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
