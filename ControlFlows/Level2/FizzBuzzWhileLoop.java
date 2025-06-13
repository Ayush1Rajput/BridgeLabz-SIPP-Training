package ControlFlows.Level2;

import java.util.Scanner;

public class FizzBuzzWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.println("Enter a positive integer: ");
        int number = sc.nextInt();

        // close the scanner
        sc.close();

        // check if the number is a positive integer
        if (number >= 1) {
            int i = 1;

            // using while loop to iterate from 1 to number
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }

                i++;
            }
        } else {
            System.out.println("The number " + number + " is not a positive integer.");
        }
    }
}
