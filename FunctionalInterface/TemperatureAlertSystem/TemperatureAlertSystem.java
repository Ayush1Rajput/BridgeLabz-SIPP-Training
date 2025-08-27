package FunctionalInterface.TemperatureAlertSystem;

import java.util.*;
import java.util.function.Predicate;

public class TemperatureAlertSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current temperature: ");
        double currentTemp = sc.nextDouble();

        System.out.print("Enter threshold temperature: ");
        double threshold = sc.nextDouble();

        // Predicate to check temperature
        Predicate<Double> isHigh = temp -> temp > threshold;

        if (isHigh.test(currentTemp)) {
            System.out.println("Temperature crossed the threshold!");
        } else {
            System.out.println("Temperature is within safe limit.");
        }

        sc.close();
    }
}
