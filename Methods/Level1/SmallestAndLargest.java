import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {

        // Creating the scanner object
        Scanner sc = new Scanner(System.in);

        // Getting input from user
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();

        sc.close(); // Close the scanner

        // Calling the method to find smallest and largest number
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Output the result
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);
    }

    // Method to find the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {

        // Assume first number is both smallest and largest initially
        int smallest = number1;
        int largest = number1;

        // Compare with second number
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number2 > largest) {
            largest = number2;
        }

        // Compare with third number
        if (number3 < smallest) {
            smallest = number3;
        }
        if (number3 > largest) {
            largest = number3;
        }

        // Return both smallest and largest in an array
        return new int[]{smallest, largest};
    }
}
