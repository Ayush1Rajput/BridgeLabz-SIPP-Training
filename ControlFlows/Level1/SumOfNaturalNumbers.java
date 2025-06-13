import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.println("Input a number: ");
        int number = sc.nextInt();

        // close the scanner
        sc.close();

        // checking if the number is a natural number
        if (number >= 1) {
            // calculating the sum using the formula
            int sum = number * (number + 1) / 2;

            // printing the result
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // handling the case for non-natural numbers
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
