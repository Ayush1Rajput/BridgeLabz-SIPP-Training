import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {

        // creating the scanner class
        Scanner sc = new Scanner(System.in);

        // getting integer input from user
        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();

        // defining the integer array to store multiplication table results
        int[] table = new int[10];

        // loop from 1 to 10 to calculate and store results
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // displaying the multiplication table from the array
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        // closing the scanner class
        sc.close();
    }
}
