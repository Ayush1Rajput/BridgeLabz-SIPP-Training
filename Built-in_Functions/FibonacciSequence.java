import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for the number of terms
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = sc.nextInt();
        System.out.println();

        // Call the method to generate Fibonacci sequence
        generateFibonacciSequence(terms);

        sc.close(); // close the scanner class
    }

    // Method to generate and print the Fibonacci sequence
    static void generateFibonacciSequence(int terms) {
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Sequence up to " + terms + " terms:");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println(); // For a clean new line at the end
    }
}
