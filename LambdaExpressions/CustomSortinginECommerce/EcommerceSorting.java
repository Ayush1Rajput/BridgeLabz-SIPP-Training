package LambdaExpressions.CustomSortinginECommerce;

import java.util.*;

public class EcommerceSorting {

    public static void main(String[] args) {
    	
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 800.0, 4.5, 10.0));
        products.add(new Product("Smartphone", 600.0, 4.7, 5.0));
        products.add(new Product("Headphones", 150.0, 4.2, 15.0));
        products.add(new Product("Watch", 100.0, 4.8, 20.0));

        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("Sorted by Price:");
        products.forEach(System.out::println);

        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("\nSorted by Rating:");
        products.forEach(System.out::println);

        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        System.out.println("\nSorted by Discount:");
        products.forEach(System.out::println);
    }
}