import java.util.*;

public class NumberCheck {
    public static void main(String[] args) {

        // creating the scanner class
        Scanner sc = new Scanner(System.in);

        // defining the integer array of 5 elements
        int[] numbers = new int[5];

        System.out.println("Input 5 numbers");

        // loop for user input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // loop to check each number
        for (int x : numbers) {
            if (x > 0) {
                if (x % 2 == 0) {
                    System.out.println("The number " + x + " is Positive and Even");
                } else {
                    System.out.println("The number " + x + " is Positive and Odd");
                }
            } else if (x < 0) {
                System.out.println("The number " + x + " is Negative");
            } else {
                System.out.println("The number is Zero");
            }
        }

        // comparing the first and last element
        System.out.println("\nComparison of First and Last Element:");
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("The first and last elements are Equal");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("The first element is Greater than the last element");
        } else {
            System.out.println("The first element is Less than the last element");
        }

        // closing the scanner class
        sc.close();
    }
}
