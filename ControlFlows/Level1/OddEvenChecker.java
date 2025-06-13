import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.println("Input a natural number: ");
        int number = sc.nextInt();

        // close the scanner
        sc.close();

        // checking if the input is a natural number
        if (number >= 1) {
            // using for loop to iterate from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }
    }
}
