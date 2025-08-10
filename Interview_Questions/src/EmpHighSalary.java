import model.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmpHighSalary {
    public static void findEmployeeWithHighSalary(List<Employee> employees){

        Optional<Employee> emp = employees.stream()
                .max(Comparator.comparingDouble(e -> e.getSalary()));

        System.out.println(emp.get().toString());

    }

    public static void main(String[] args) {
        findEmployeeWithHighSalary(Arrays.asList(
                new Employee(1, "Hari", 20000),
                new Employee(2, "Prasath", 30000),
                new Employee(3, "Maran", 40000),
                new Employee(4, "Mogan", 20000)
        ));
    }
}
