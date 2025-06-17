import java.util.Scanner;

public class WindChillCalculator {
    public static void main(String[] args) {

        // Creating the scanner object
        Scanner sc = new Scanner(System.in);

        // Getting input from user
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = sc.nextDouble();

        System.out.print("Enter the wind speed (in mph): ");
        double windSpeed = sc.nextDouble();

        sc.close(); // Close the scanner

        // Calling the method to calculate wind chill
        double windChill = calculateWindChill(temperature, windSpeed);

        // Output the result
        System.out.printf("The wind chill temperature is: %.2f°F%n", windChill);
    }

    // Method to calculate wind chill using the given formula
    public static double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74 + 0.6215 * temperature + 
                          (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }
}
