import java.util.Scanner;

public class CompareSumWithForLoop {
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

            // compute using for loop
            int sumByLoop = 0;
            for (int i = 1; i <= number; i++) {
                sumByLoop += i;
            }

            // display results
            System.out.println("Sum using formula: " + sumByFormula);
            System.out.println("Sum using for loop: " + sumByLoop);

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
