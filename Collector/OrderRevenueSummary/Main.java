package Collector.OrderRevenueSummary;

import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("Aman", 200.5),
            new Order("Riya", 150.0),
            new Order("Aman", 300.0),
            new Order("Vikas", 400.75)
        );

        Map<String, Double> revenue = orders.stream()
            .collect(Collectors.groupingBy(Order::getCustomer,
                    Collectors.summingDouble(Order::getAmount)));

        System.out.println(revenue);
    }
}
