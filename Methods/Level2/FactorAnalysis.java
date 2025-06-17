import java.util.Scanner;

public class FactorAnalysis {
    public static void main(String[] args) {

        // Creating the scanner object
        Scanner sc = new Scanner(System.in);

        // Getting input from user
        System.out.print("Enter a number to find its factors: ");
        int number = sc.nextInt();

        sc.close(); // Close the scanner

        // Calling method to find factors
        int[] factors = findFactors(number);

        // Displaying the factors
        System.out.print("Factors of " + number + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println(); // move to next line

        // Calling and displaying the sum of factors
        int sum = findSumOfFactors(factors);
        System.out.println("Sum of factors: " + sum);

        // Calling and displaying the product of factors
        int product = findProductOfFactors(factors);
        System.out.println("Product of factors: " + product);

        // Calling and displaying the sum of squares of factors
        int sumOfSquares = findSumOfSquares(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
    }

    // Method to find factors and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;

        // First loop to count number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array with the size of factor count
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find the sum of factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int num : factors) {
            sum += num;
        }
        return sum;
    }

    // Method to find the product of factors
    public static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int num : factors) {
            product *= num;
        }
        return product;
    }

    // Method to find the sum of squares of factors
    public static int findSumOfSquares(int[] factors) {
        int sum = 0;
        for (int num : factors) {
            sum += Math.pow(num, 2); // square of the factor
        }
        return sum;
    }
}
