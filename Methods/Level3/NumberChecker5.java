import java.util.Scanner;

public class NumberChecker5 {

    // Method to find the count of factors
    public static int countFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    // Method to find and return factors as an array
    public static int[] getFactors(int number) {
        int count = countFactors(number);
        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    // Method to find the greatest factor (excluding the number itself, if required)
    public static int findGreatestFactor(int[] factors) {
        int max = factors[0];
        for (int factor : factors) {
            if (factor > max) {
                max = factor;
            }
        }
        return max;
    }

    // Method to find sum of all factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find product of all factors
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find product of cubes of all factors
    public static double findProductOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Get factors array
        int[] factors = getFactors(number);

        // Display factors
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Display greatest factor
        int greatest = findGreatestFactor(factors);
        System.out.println("Greatest factor: " + greatest);

        // Display sum of factors
        int sum = findSumOfFactors(factors);
        System.out.println("Sum of factors: " + sum);

        // Display product of factors
        long product = findProductOfFactors(factors);
        System.out.println("Product of factors: " + product);

        // Display product of cube of factors
        double cubeProduct = findProductOfCubeOfFactors(factors);
        System.out.println("Product of cube of all factors: " + cubeProduct);

        sc.close();
    }
}
