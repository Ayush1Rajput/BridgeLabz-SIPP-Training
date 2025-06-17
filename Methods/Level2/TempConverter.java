import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {

        // Creating the scanner object
        Scanner sc = new Scanner(System.in);

        // Getting input for Fahrenheit to Celsius
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        System.out.println("In Celsius: " + convertFahrenheitToCelsius(fahrenheit));

        // Getting input for Celsius to Fahrenheit
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println("In Fahrenheit: " + convertCelsiusToFahrenheit(celsius));

        // Getting input for pounds to kilograms
        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();
        System.out.println("In kilograms: " + convertPoundsToKilograms(pounds));

        // Getting input for kilograms to pounds
        System.out.print("Enter weight in kilograms: ");
        double kilograms = sc.nextDouble();
        System.out.println("In pounds: " + convertKilogramsToPounds(kilograms));

        // Getting input for gallons to liters
        System.out.print("Enter volume in gallons: ");
        double gallons = sc.nextDouble();
        System.out.println("In liters: " + convertGallonsToLiters(gallons));

        // Getting input for liters to gallons
        System.out.print("Enter volume in liters: ");
        double liters = sc.nextDouble();
        System.out.println("In gallons: " + convertLitersToGallons(liters));

        sc.close(); // Close the scanner
    }

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
}
