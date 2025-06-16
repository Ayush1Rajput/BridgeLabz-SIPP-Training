import java.util.*;

public class FactorFinder {
    public static void main(String[] args) {

        // creating the scanner class
        Scanner sc = new Scanner(System.in);

        // getting input from user
        System.out.print("Enter a number to find its factors: ");
        int number = sc.nextInt();

        // checking for valid input
        if (number <= 0) {
            System.err.println("Invalid input. Please enter a positive number.");
            sc.close();
            return; // exit the program
        }

        // initializing maxFactor size and creating factors array
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // finding factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // check if index reached array size
                if (index == maxFactor) {
                    // doubling the array size
                    maxFactor = maxFactor * 2;
                    int[] temp = new int[maxFactor];

                    // copying values from old array to new temp array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    // assigning new array to factors
                    factors = temp;
                }

                // storing the factor
                factors[index] = i;
                index++;
            }
        }

        // displaying the factors
        System.out.println("The factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        // closing the scanner class
        sc.close();
    }
}
