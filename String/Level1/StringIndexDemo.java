import java.util.*;

public class StringIndexDemo {

    public static void main(String[] args) {

        // Create Scanner class
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter any text: ");
        String input = sc.next();

        System.out.println();

        // Call method to generate the exception
        System.out.println("Calling method to generate StringIndexOutOfBoundsException:");
        generateStringIndexException(input);

        System.out.println();

        // Call method to handle the exception using try-catch
        System.out.println("Calling method to handle StringIndexOutOfBoundsException:");
        handleStringIndexException(input);

        sc.close(); // close the scanner
    }

    // Method to generate StringIndexOutOfBoundsException
    public static void generateStringIndexException(String str) {
        // Trying to access an index out of bounds
        System.out.println("Accessing character at index " + str.length());
        char ch = str.charAt(str.length()); // This line will throw exception
        System.out.println("Character at index " + str.length() + ": " + ch);
    }

    // Method to handle StringIndexOutOfBoundsException using try-catch
    public static void handleStringIndexException(String str) {
        try {
            // Accessing invalid index
            System.out.println("Accessing character at index " + str.length());
            char ch = str.charAt(str.length());
            System.out.println("Character at index " + str.length() + ": " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println("StringIndexOutOfBoundsException caught!");
            System.out.println("You tried to access an index beyond the string length.");
        }
    }
}
