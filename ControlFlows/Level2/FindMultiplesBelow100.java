import java.util.Scanner;

public class FindMultiplesBelow100 {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number
        System.out.print("Enter a positive number less than 100: ");
        int number = scanner.nextInt();

        // Validate the input
        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input! Please enter a number between 1 and 99.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");

            // Loop backward from 100 to 1
            for (int i = 100; i >= 1; i--) {
                // Check if i is a multiple of the number
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }

        // Close the scanner
        scanner.close();
    }
}
