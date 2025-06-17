import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        // Creating the scanner object
        Scanner sc = new Scanner(System.in);

        // Getting input from user
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        sc.close(); // Close the scanner

        // Calling the method to calculate the sum
        int result = findSumOfNaturalNumbers(n);

        // Output the result
        System.out.println("The sum of first " + n + " natural numbers is: " + result);
    }

    // Method to find the sum of n natural numbers using loop
    public static int findSumOfNaturalNumbers(int n) {
        int sum = 0;

        // Loop from 1 to n and add each number to sum
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        return sum; // return the answer
    }
}
