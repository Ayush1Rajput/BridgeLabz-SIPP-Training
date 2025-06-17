import java.util.Scanner;

public class SumComparison {
    public static void main(String[] args) {

        // Creating the scanner object
        Scanner sc = new Scanner(System.in);

        // Getting input from user
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        sc.close(); // Close the scanner

        // Check if the input is a natural number
        if (number <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
            return;
        }

        // Calling method to find sum using recursion
        int recursiveSum = sumUsingRecursion(number);

        // Calling method to find sum using formula
        int formulaSum = sumUsingFormula(number);

        // Display the results
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        // Compare both results
        if (recursiveSum == formulaSum) {
            System.out.println("Both results are equal. The calculation is correct.");
        } else {
            System.out.println("Results do not match. Please check the logic.");
        }
    }

    // Method to find sum using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumUsingRecursion(n - 1);
        }
    }

    // Method to find sum using formula
    public static int sumUsingFormula(int n) {
        re
