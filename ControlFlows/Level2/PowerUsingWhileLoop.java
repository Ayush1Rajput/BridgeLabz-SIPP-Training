import java.util.Scanner;

public class PowerUsingWhileLoop {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the base number
        System.out.print("Enter a positive integer (base number): ");
        int number = scanner.nextInt();

        // Prompt user to enter the power
        System.out.print("Enter a positive integer (power): ");
        int power = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Validate inputs
        if (number < 0 || power < 0) {
            System.out.println("Invalid input! Please enter only positive integers.");
        } else {
            // Initialize result and counter
            int result = 1;
            int counter = 0;

            // Calculate power using while loop
            while (counter != power) {
                result *= number;
                counter++;
            }

            // Display the result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

     
    }
}
