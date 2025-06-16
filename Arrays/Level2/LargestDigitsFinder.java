package Arrays.Level2;

import java.util.*;

public class LargestDigitsFinder {
    public static void main(String[] args) {

        // creating the scanner class
        Scanner sc = new Scanner(System.in);

        // define maxDigit and index variable
        int maxDigit = 10;
        int index = 0;

        // array to store digits
        int[] digits = new int[maxDigit];

        // take user input
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        // validate number
        if (number <= 0) {
            System.err.println("Invalid input! Please enter a positive number.");
            sc.close();
            return;
        }

        // extracting digits and storing in array
        while (number != 0) {
            int digit = number % 10;
            digits[index] = digit;
            index++;

            // breaking if index reaches maxDigit
            if (index == maxDigit) {
                break;
            }

            number = number / 10;
        }

        // initializing largest and second largest
        int largest = -1;
        int secondLargest = -1;

        // finding the largest and second largest digits
        for (int i = 0; i < index; i++) {
            int currentDigit = digits[i];

            if (currentDigit > largest) {
                secondLargest = largest;
                largest = currentDigit;
            } else if (currentDigit > secondLargest && currentDigit != largest) {
                secondLargest = currentDigit;
            }
        }

        

        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("There is no second largest digit (all digits are same).");
        }

        // closing the scanner
        sc.close();
    }
}
