package org.revature.jdbc.Service;

import org.revature.jdbc.Model.Employee;

public interface Service {

    public void getAllEmployee();
    public void getEmployeeById();
    public void saveEmployee();
    public void updateEmployee();
    public void deleteEmployee();
    public void getTotalEmployeeCount();
    public void getTotalDeptCount();
    public void getEmployeesNameInUpperCase() ;

}
