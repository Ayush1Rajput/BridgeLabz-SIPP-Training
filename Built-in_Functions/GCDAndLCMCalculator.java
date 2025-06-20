import java.util.Scanner;

public class GCDAndLCMCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        int[] numbers = takeInput(sc);
        int num1 = numbers[0];
        int num2 = numbers[1];

        // Calculate GCD and LCM
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);

        // Display the results
        displayResults(num1, num2, gcd, lcm);

        sc.close();
    }

    // Method to take input from the user
    static int[] takeInput(Scanner sc) {
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        System.out.println();

        return new int[]{number1, number2};
    }

    // Method to calculate GCD using Euclidean Algorithm
    static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }

    // Method to calculate LCM using the GCD
    static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    // Method to display results
    static void displayResults(int num1, int num2, int gcd, int lcm) {
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        System.out.println();
    }
}
