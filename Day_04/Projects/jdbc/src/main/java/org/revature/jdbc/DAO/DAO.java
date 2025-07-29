package org.revature.jdbc.DAO;

import org.revature.jdbc.Model.Employee;

public interface DAO {
    public void getAllEmployee();
    public void getEmployeeById(int id);
    public void saveEmployee(Employee employee);
    public void updateEmployee(Employee employee);
    public void deleteEmployee(int id);
    public void getTotalEmployeeCount();
    public void getTotalDeptCount();
    public void getEmployeesNameInUpperCase();
}
