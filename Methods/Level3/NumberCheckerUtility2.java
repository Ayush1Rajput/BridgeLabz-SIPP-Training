import java.util.Scanner;
import java.util.Arrays;

public class NumberCheckerUtility2 {

    // Method to count digits in the number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store digits in an array
    public static int[] getDigitsArray(int number) {
        String numberStr = String.valueOf(number);
        int[] digits = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = Character.getNumericValue(numberStr.charAt(i));
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check if number is palindrome using digits array
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check if number is a Duck number
    // Duck number has non-zero digits and contains at least one '0' (not starting with 0)
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking number input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Get digits array
        int[] digits = getDigitsArray(number);

        // Count digits
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        // Reverse digits array
        int[] reversedDigits = reverseArray(digits);
        System.out.print("Reversed digits array: ");
        for (int digit : reversedDigits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Check palindrome
        boolean isPalin = isPalindrome(digits);
        if (isPalin) {
            System.out.println(number + " is a Palindrome number.");
        } else {
            System.out.println(number + " is not a Palindrome number.");
        }

        // Check duck number
        boolean isDuck = isDuckNumber(digits);
        if (isDuck) {
            System.out.println(number + " is a Duck number.");
        } else {
            System.out.println(number + " is not a Duck number.");
        }

        sc.close();
    }
}
