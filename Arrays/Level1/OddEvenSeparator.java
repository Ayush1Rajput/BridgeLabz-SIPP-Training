import java.util.*;

public class OddEvenSeparator {
    public static void main(String[] args) {

        // creating the scanner class
        Scanner sc = new Scanner(System.in);

        // getting user input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // checking if number is a natural number (greater than 0)
        if (number <= 0) {
            System.err.println("Invalid input. Please enter a natural number (greater than 0).");
            sc.close();
            return; // exit the program if condition if pass
        }

        // creating arrays for even and odd numbers
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];

        // index variables for even and odd arrays
        int evenIndex = 0;
        int oddIndex = 0;

        // loop from 1 to the number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        // displaying the odd numbers array
        System.out.println();
        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        // displaying the even numbers array
        System.out.println(); System.out.println();
        System.out.println("Even Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        // closing the scanner class
        sc.close();
    }
}
