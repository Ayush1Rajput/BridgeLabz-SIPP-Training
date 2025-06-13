package ControlFlows.Level2;

import java.util.Scanner;

public class GreatestFactorWhileLoop {
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
            int counter = number - 1;

            // using while loop to find greatest factor
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break; // exit the loop once greatest factor is found
                }
                counter--;
            }

            // display the result
            System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
        } else {
            System.out.println("The number " + number + " does not have a valid factor excluding itself.");
        }
    }
}
