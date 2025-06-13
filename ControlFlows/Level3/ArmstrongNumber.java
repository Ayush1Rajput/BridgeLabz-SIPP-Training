import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Creating scanner class
        Scanner sc = new Scanner(System.in);

        // Getting input from user
        System.out.print("Enter a number to check if it is an Armstrong Number: ");
        int number = sc.nextInt();

        // Initializing variables
        int originalNumber = number; // Store the original number
        int sum = 0; // Will store sum of cubes of digits

        // Using a while loop to go through each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10;         // Get last digit
            sum = sum + (digit * digit * digit);     // Add cube of the digit to sum
            originalNumber = originalNumber / 10;    // Remove the last digit
        }

        // Check if the sum of cubes is equal to the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is Not an Armstrong Number.");
        }

        // Closing the scanner class
        sc.close();
    }
}
