import java.util.*;

public class HarshadNumberCheck {
    public static void main(String[] args) {
        // Creating scanner class
        Scanner sc = new Scanner(System.in);

        // Getting number input from user
        System.out.print("Enter a number to check if it is a Harshad Number: ");
        int number = sc.nextInt();

        // Initializing variables
        int sum = 0;
        int originalNumber = number; // Keep a copy of the original number

        // Loop to calculate the sum of digits
        while (number != 0) {
            int digit = number % 10;  // Get last digit
            sum = sum + digit;        // Add digit to sum
            number = number / 10;     // Remove last digit
        }

        // Check if original number is divisible by sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is Not a Harshad Number.");
        }

        // Closing the scanner class
        sc.close();
    }
}
