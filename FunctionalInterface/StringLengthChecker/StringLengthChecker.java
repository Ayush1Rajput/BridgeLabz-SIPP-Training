package FunctionalInterface.StringLengthChecker;

import java.util.*;
import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your message: ");
        String message = sc.nextLine();

        System.out.print("Enter character limit: ");
        int limit = sc.nextInt();

        // Function to calculate length
        Function<String, Integer> lengthCalculator = str -> str.length();

        int messageLength = lengthCalculator.apply(message);

        System.out.println("Message length: " + messageLength);
        if (messageLength > limit) {
            System.out.println("Message exceeds character limit!");
        } else {
            System.out.println("Message is within the limit.");
        }

        sc.close();
    }
}