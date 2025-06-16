import java.util.*;

public class MultiplicationFrom6To9 {
    public static void main(String[] args) {

        // creating the scanner class
        Scanner sc = new Scanner(System.in);

        // getting integer input from user
        System.out.print("Enter a number to print its multiplication table from 6 to 9: ");
        int number = sc.nextInt();

        // defining the integer array to store results from 6 to 9 (4 elements)
        int[] multiplicationResult = new int[4];

        // loop from 6 to 9 to calculate and store multiplication results
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // displaying the multiplication table from the array
        System.out.println();
        System.out.println("Multiplication Table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        // closing the scanner class
        sc.close();
    }
}
