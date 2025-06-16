package Arrays.Level2;

import java.util.*;

public class LargestDigitsFinderDynamic {
    public static void main(String[] args) {

        // creating the scanner class
        Scanner sc = new Scanner(System.in);

        // initial maxDigit and index
        int maxDigit = 10;
        int index = 0;

        // creating the digits array
        int[] digits = new int[maxDigit];

        // taking user input
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        // validating input
        if (number <= 0) {
            System.err.println("Invalid input! Please enter a positive number.");
            sc.close();
            return;
        }

        // extracting digits and storing in array
        while (number != 0) {
            // check if array needs resizing
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < index; i++) {
                    temp[i] = digits[i];
                }
                digits = temp; // reassign the reference
            }

            int digit = number % 10;
            digits[index] = digit;
            index++;
            number = number / 10;
        }

        // initializing largest and second largest
        int largest = -1;
        int secondLargest = -1;

        // loop to find largest and second largest digits
        for (int i = 0; i < index; i++) {
            int currentDigit = digits[i];

            if (currentDigit > largest) {
                secondLargest = largest;
                largest = currentDigit;
            } else if (currentDigit > secondLargest && currentDigit != largest) {
                secondLargest = currentDigit;
            }
        }

        

        // display result
        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("There is no second largest digit (all digits are same).");
        }

        // closing scanner
        sc.close();
    }
}

