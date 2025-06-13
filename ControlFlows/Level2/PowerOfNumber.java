import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the base number
        System.out.print("Enter a positive integer (base number): ");
        int number = scanner.nextInt();

        // Prompt user to enter the power
        System.out.print("Enter a positive integer (power): ");
        int power = scanner.nextInt();

        // Validate inputs
        if (number < 0 || power < 0) {
            System.out.println("Invalid input! Please enter positive integers only.");
        } else {
            // Initialize result to 1
            int result = 1;

            // Calculate power using loop
            for (int i = 1; i <= power; i++) {
                result *= number;
            }

            // Display the result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        // Close the scanner
        scanner.close();
    }
}
