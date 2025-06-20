import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        int number = takeInput(sc);

        // Calculate factorial using recursion
        long result = calculateFactorial(number);

        // Display the result
        displayResult(number, result);

        sc.close();
    }

    // Method to take input from the user
    static int takeInput(Scanner sc) {
        System.out.print("Enter a integer to calculate its factorial: ");
        int num = sc.nextInt();
        System.out.println();
        return num;
    }

    // Recursive method to calculate factorial
    static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    // Method to display the result
    static void displayResult(int number, long result) {
        System.out.println("Factorial of " + number + " is: " + result);
        System.out.println();
    }
}
