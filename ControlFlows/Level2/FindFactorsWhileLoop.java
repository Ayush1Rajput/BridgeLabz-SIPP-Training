package ControlFlows.Level2;

import java.util.Scanner;

public class FindFactorsWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.println("Enter a positive integer to find its factors: ");
        int number = sc.nextInt();

        // close the scanner
        sc.close();

        // check if the number is a positive integer
        if (number > 0) {
            System.out.println("The factors of " + number + " are:");
            int i = 1;
            while (i <= number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("The number " + number + " is not a positive integer.");
        }
    }
}

