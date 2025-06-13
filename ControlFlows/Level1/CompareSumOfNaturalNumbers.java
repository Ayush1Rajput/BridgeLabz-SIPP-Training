import java.util.Scanner;

public class CompareSumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.println("Input a natural number: ");
        int number = sc.nextInt();

        // close the scanner
        sc.close();

        // check if the input is a natural number (>= 1)
        if (number >= 1) {
            // compute using formula
            int sumByFormula = number * (number + 1) / 2;

            // compute using while loop
            int sumByLoop = 0;
            int counter = 1;
            while (counter <= number) {
                sumByLoop += counter;
                counter++;
            }

            // display results
            System.out.println("Sum using formula: " + sumByFormula);
            System.out.println("Sum using while loop: " + sumByLoop);

            // compare both results
            if (sumByFormula == sumByLoop) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("There is a mismatch in the results.");
            }

        } else {
            // input is not a natural number
            System.out.println("The number " + number + " is not a natural number.");
        }
    }
}
