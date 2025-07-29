package org.revature.emp.Sort;

import org.revature.emp.Employee;

import java.util.Comparator;

public class SortEmployeesById implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getId() > o2.getId()) return -1;
        if (o1.getId() < o2.getId()) return 1;
        return 0;
    }
}
