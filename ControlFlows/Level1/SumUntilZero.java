import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // initializing variables
        double total = 0.0;
        double number;

        // taking input from user
        System.out.println("Enter numbers to sum (enter 0 to stop): ");
        number = sc.nextDouble();

        // using while loop to continue until user enters 0
        while (number != 0) {
            total += number;  // adding current number to total

            // prompt again for input
            System.out.println("Enter another number (0 to stop): ");
            number = sc.nextDouble();
        }

        // close the scanner
        sc.close();

        // display the result
        System.out.println("The total sum is: " + total);
    }
}
