import java.util.Scanner;

public class NumberChecker {

    public static void main(String[] args) {
        // Creating scanner object
        Scanner sc = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Loop to take input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Loop through the array to check each number
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                // If number is positive, check even or odd
                if (isEven(numbers[i])) {
                    System.out.println(numbers[i] + " is positive and even.");
                } else {
                    System.out.println(numbers[i] + " is positive and odd.");
                }
            } else {
                // Number is negative
                System.out.println(numbers[i] + " is negative.");
            }
        }

        // Compare first and last elements of the array
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        if (result == 1) {
            System.out.println("The first element " + numbers[0] + " is greater than the last element " + numbers[numbers.length - 1]);
        } else if (result == 0) {
            System.out.println("The first element " + numbers[0] + " is equal to the last element " + numbers[numbers.length - 1]);
        } else {
            System.out.println("The first element " + numbers[0] + " is less than the last element " + numbers[numbers.length - 1]);
        }

        sc.close(); // Close the scanner
    }

    // Method to check if number is positive (returns true) or negative (returns false)
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check if number is even (returns true) or odd (returns false)
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }
}
