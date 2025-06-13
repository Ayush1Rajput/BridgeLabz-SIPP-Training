import java.util.*;

public class DigitCounter {
    public static void main(String[] args) {
        // Creating scanner class
        Scanner sc = new Scanner(System.in);

        // Getting input from user
        System.out.print("Enter an integer number: ");
        int number = sc.nextInt();

        // Special case: if number is 0, it has 1 digit
        if (number == 0) {
            System.out.println("The number of digits = 1");
        } else {
            // Initializing count variable
            int count = 0;

            // Taking absolute value in case of negative input
            number = Math.abs(number);

            // Loop to count digits
            while (number != 0) {
                number = number / 10; // Remove the last digit
                count++;              // Increase count by 1
            }

            // Displaying the result
            System.out.println("The number of digits = " + count);
        }

        // Closing the scanner class
        sc.close();
    }
}
