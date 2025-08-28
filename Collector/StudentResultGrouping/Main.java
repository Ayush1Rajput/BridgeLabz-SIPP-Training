package Collector.StudentResultGrouping;

import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Aman", "A"),
            new Student("Riya", "B"),
            new Student("Vikas", "A"),
            new Student("Neha", "C"),
            new Student("Arjun", "B")
        );

        Map<String, List<String>> result = students.stream()
            .collect(Collectors.groupingBy(Student::getGrade,
                    Collectors.mapping(Student::getName, Collectors.toList())));

        System.out.println(result);
    }
}
