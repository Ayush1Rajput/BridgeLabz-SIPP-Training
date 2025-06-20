import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take temperature input and type
        double temperature = takeTemperatureInput(sc);
        int choice = takeConversionChoice(sc);

        // Perform conversion based on user choice
        if (choice == 1) {
            double celsius = convertFahrenheitToCelsius(temperature);
            displayResult(temperature, celsius, "Fahrenheit", "Celsius");
        } else if (choice == 2) {
            double fahrenheit = convertCelsiusToFahrenheit(temperature);
            displayResult(temperature, fahrenheit, "Celsius", "Fahrenheit");
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        sc.close();
    }

    // Method to take temperature input
    static double takeTemperatureInput(Scanner sc) {
        System.out.print("Enter the temperature value: ");
        double temp = sc.nextDouble();
        return temp;
    }

    // Method to take user's choice of conversion
    static int takeConversionChoice(Scanner sc) {
        System.out.println("Choose conversion type:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();
        System.out.println();
        return choice;
    }

    // Method to convert Fahrenheit to Celsius
    static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to display the result
    static void displayResult(double original, double converted, String fromUnit, String toUnit) {
        System.out.println(original + "° " + fromUnit + " = " + converted + "° " + toUnit);
        System.out.println();
    }
}
