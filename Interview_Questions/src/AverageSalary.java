import model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSalary {
    public static void avgSalary(List<Employee> employees){
        Double average = employees
                .stream()
                .collect(Collectors.averagingDouble(e -> e.getSalary()));

        System.out.println("The Average salary is " +average);
    }

    public static void main(String[] args) {
        avgSalary(Arrays.asList(
                new Employee(1, "Hari", 20000),
                new Employee(2, "Prasath", 30000),
                new Employee(3, "Maran", 40000),
                new Employee(4, "Mogan", 20000)
        ));
    }
}
