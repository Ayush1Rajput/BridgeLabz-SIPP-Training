import java.util.Scanner;

public class MultiplesUsingWhileLoop {
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

            // Initialize counter to number - 1
            int counter = number - 1;

            // Use while loop to iterate until counter > 1
            while (counter > 1) {
                // Check if counter perfectly divides 100
                if (100 % counter == 0 && counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }

        // Close the scanner
        scanner.close();
    }
}
