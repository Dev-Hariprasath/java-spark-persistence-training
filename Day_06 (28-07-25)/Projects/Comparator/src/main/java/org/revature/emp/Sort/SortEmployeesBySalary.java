package org.revature.emp.Sort;

import org.revature.emp.Employee;

import java.util.Comparator;

public class SortEmployeesBySalary implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2){
        if(e1.getSalary() < e2.getSalary()) return -1;
        if(e1.getSalary() > e2.getSalary()) return 1;
        return 0;
    }
}
