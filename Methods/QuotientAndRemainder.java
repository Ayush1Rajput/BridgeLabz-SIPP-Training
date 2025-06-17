import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {

        // Creating the scanner object
        Scanner sc = new Scanner(System.in);

        // Getting input from user
        System.out.print("Enter the number (dividend): ");
        int number = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        sc.close(); // Close the scanner

        // Calling the method to find quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        // Output the result
        System.out.println("Quotient is: " + result[0]);
        System.out.println("Remainder is: " + result[1]);
    }

    // Method to find the remainder and quotient of a number
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;

        // Return both quotient and remainder in an array
        return new int[]{quotient, remainder};
    }
}
