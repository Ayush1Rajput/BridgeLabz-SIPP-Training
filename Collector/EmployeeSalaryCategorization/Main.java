package Collector.EmployeeSalaryCategorization;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Aman", "IT", 50000),
            new Employee("Riya", "HR", 40000),
            new Employee("Vikas", "IT", 60000),
            new Employee("Neha", "Finance", 70000),
            new Employee("Arjun", "HR", 45000)
        );

        Map<String, Double> avgSalaryByDept = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment,
                    Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(avgSalaryByDept);
    }
}
