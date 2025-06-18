import java.util.Scanner;

public class NumberChecker4 {

    // Method to calculate factorial of a digit
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to calculate sum of proper divisors
    public static int sumOfProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Method to check if number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = sumOfProperDivisors(number);
        return sum == number;
    }

    // Method to check if number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int sum = sumOfProperDivisors(number);
        return sum > number;
    }

    // Method to check if number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int sum = sumOfProperDivisors(number);
        return sum < number;
    }

    // Method to check if number is a strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking number input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check perfect number
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a Perfect number.");
        } else {
            System.out.println(number + " is not a Perfect number.");
        }

        // Check abundant number
        if (isAbundantNumber(number)) {
            System.out.println(number + " is an Abundant number.");
        } else {
            System.out.println(number + " is not an Abundant number.");
        }

        // Check deficient number
        if (isDeficientNumber(number)) {
            System.out.println(number + " is a Deficient number.");
        } else {
            System.out.println(number + " is not a Deficient number.");
        }

        // Check strong number
        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }

        sc.close();
    }
}
