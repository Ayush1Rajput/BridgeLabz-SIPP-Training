import java.util.*;

public class NumberFormatDemo {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take string input from user
        System.out.print("Enter a number in text form: ");
        String input = sc.next();

        System.out.println();

        // Call method to generate the exception
        System.out.println("Calling method to generate NumberFormatException:");
        generateNumberFormatException(input);

        System.out.println();

        // Call method to handle the exception using try-catch
        System.out.println("Calling method to handle NumberFormatException:");
        handleNumberFormatException(input);

        sc.close(); // close the scanner
    }

    // Method to generate NumberFormatException
    public static void generateNumberFormatException(String text) {
        // Trying to convert non-numeric text into integer
        System.out.println("Trying to convert text to number...");
        int number = Integer.parseInt(text); // This will throw exception if text is not a valid number
        System.out.println("Converted number: " + number);
    }

    // Method to handle NumberFormatException using try-catch
    public static void handleNumberFormatException(String text) {
        try {
            System.out.println("Trying to convert text to number...");
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught!");
            System.out.println("Input text is not a valid number.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught!");
        }
    }
}
