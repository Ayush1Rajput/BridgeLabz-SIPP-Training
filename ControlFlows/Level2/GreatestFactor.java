package ControlFlows.Level2;

import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.println("Enter a positive integer: ");
        int number = sc.nextInt();

        // close the scanner
        sc.close();

        // check if the number is a positive integer
        if (number > 1) {
            int greatestFactor = 1;

            // run the loop from number - 1 down to 1
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break; // exit the loop once greatest factor is found
                }
            }

            // display the result
            System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
        } else {
            System.out.println("The number " + number + " does not have a valid factor excluding itself.");
        }
    }
}

