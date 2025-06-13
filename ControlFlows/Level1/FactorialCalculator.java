import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.println("Input a positive integer: ");
        int number = sc.nextInt();

        // close the scanner
        sc.close();

        // checking if the input is a positive integer
        if (number >= 0) {
            long factorial = 1;
            int i = 1;

            // calculating factorial using while loop
            while (i <= number) {
                factorial *= i;
                i++;
            }

            // displaying the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        } else {
            // handling negative input
            System.out.println("The number " + number + " is not a positive integer.");
        }
    }
}
