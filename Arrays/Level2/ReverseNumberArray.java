package Arrays.Level2;

import java.util.*;

public class ReverseNumberArray {
    public static void main(String[] args) {

        // creating the scanner class
        Scanner sc = new Scanner(System.in);

        // take input from user
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        // validating the number
        if (number <= 0) {
            System.err.println("Invalid input! Please enter a positive number.");
            sc.close();
            return;
        }

        int temp = number;
        int count = 0;

        // finding number of digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        // creating array to store digits
        int[] digits = new int[count];

        // extracting digits and storing in array
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number = number / 10;
        }

        // creating another array for reversed digits
        int[] reversedDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }

        // displaying the reversed number
        System.out.println("Reversed number is:");
        for (int i = 0; i < count; i++) {
            System.out.print(reversedDigits[i]);
        }

        // closing the scanner class
        sc.close();
    }
}
