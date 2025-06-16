import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {

        // creating the scanner class
        Scanner sc = new Scanner(System.in);

        // getting user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // checking if the number is valid (positive)
        if (number <= 0) {
            System.err.println("Invalid input. Please enter a positive integer.");
            sc.close();
            return; // exit the program
        }

        // creating a String array to store the results
        String[] resultArray = new String[number + 1];

        // loop to store values as per FizzBuzz logic
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                resultArray[i] = "FizzBuzz";
            } else if (i % 3 == 0 && i != 0) {
                resultArray[i] = "Fizz";
            } else if (i % 5 == 0 && i != 0) {
                resultArray[i] = "Buzz";
            } else {
                resultArray[i] = Integer.toString(i);
            }
        }

        // displaying the results
        System.out.println("\nFizzBuzz Results:");
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + resultArray[i]);
        }

        // closing the scanner class
        sc.close();
    }
}
