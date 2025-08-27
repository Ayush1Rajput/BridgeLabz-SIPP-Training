package StreamAPI.StreamAPI_Method.TransformingNames;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ayush", "divanshu", "riya", "aman", "kavya");

        System.out.println("Customer Names (Uppercase & Alphabetical):");
        names.stream()
             .map(String::toUpperCase)
             .sorted()
             .forEach(System.out::println);
    }
}
