package org.revature.emp.Sort;

import org.revature.emp.Employee;

import java.util.Comparator;

public class SortEmployeesByName implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2){
        return e1.equals(e2) ? 0 : e1.getName().compareToIgnoreCase(e2.getName());
    }
}
