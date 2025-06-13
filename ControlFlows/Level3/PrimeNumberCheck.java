import java.util.*;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        // Creating scanner class
        Scanner sc = new Scanner(System.in);

        // Getting input from user
        System.out.print("Enter a number to check if it is prime: ");
        int num = sc.nextInt();

        // Boolean variable to store prime result
        boolean isPrime = true;

        // Prime numbers are greater than 1
        if (num <= 1) {
            isPrime = false;
        } else {
            // Looping from 2 to num - 1
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    // If divisible by any number other than 1 and itself
                    isPrime = false;
                    break; // No need to check further
                }
            }
        }

        // Printing the result
        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is Not a Prime Number.");
        }

        // Closing the scanner class
        sc.close();
    }
}
