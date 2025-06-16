package Arrays.Level2;
import java.util.*;

public class DigitFrequencyFinder {
    public static void main(String[] args) {

        // Creating the Scanner class
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        // Check for non-positive number
        if (number <= 0) {
            System.out.println("Please enter a positive number only.");
            sc.close();
            return;
        }

        // Creating an array to store the digits
        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;
        int originalNumber = number;

        // Extracting digits from number
        while (number != 0) {
            int digit = number % 10;
            digits[index] = digit;
            index++;
            number /= 10;
        }

        // Creating frequency array
        int[] frequency = new int[10];

        // Counting frequency of each digit
        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }

        // Displaying frequency
        System.out.println("Digit Frequency in " + originalNumber + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " => " + frequency[i] + " time(s)");
            }
        }

        // Closing the scanner
        sc.close();
    }
}
