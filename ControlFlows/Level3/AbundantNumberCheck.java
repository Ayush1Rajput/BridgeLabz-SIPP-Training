import java.util.*;

public class AbundantNumberCheck {
    public static void main(String[] args) {
        // Creating scanner class
        Scanner sc = new Scanner(System.in);

        // Getting number input from user
        System.out.print("Enter a number to check if it is an Abundant Number: ");
        int number = sc.nextInt();

        // Initializing sum to store sum of divisors
        int sum = 0;

        // Loop from 1 to number - 1 to find divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;  // Add divisor to sum
            }
        }

        // Check if sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }

        // Closing the scanner class
        sc.close();
    }
}
