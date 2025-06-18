import java.util.*;

public class IllegalArgumentDemo {

    public static void main(String[] args) {

        System.out.println();
        
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println();

        // Call method to generate the exception
        System.out.println("Calling method to generate IllegalArgumentException:");
        generateIllegalArgumentException(text);

        System.out.println();

        // Call method to handle the exception using try-catch
        System.out.println("Calling method to handle IllegalArgumentException:");
        handleIllegalArgumentException(text);

        sc.close(); // close scanner
    }

    // Method to generate IllegalArgumentException
    public static void generateIllegalArgumentException(String str) {
        // This will throw IllegalArgumentException: begin > end
        System.out.println("Trying to extract substring with invalid range...");
        String result = str.substring(5, 2); // start index > end index
        System.out.println("Substring: " + result);
    }

    // Method to handle IllegalArgumentException using try-catch
    public static void handleIllegalArgumentException(String str) {
        try {
            System.out.println("Trying to extract substring with invalid range...");
            String result = str.substring(5, 2); // invalid usage
            System.out.println("Substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught!");
            System.out.println("Start index is greater than end index in substring()");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught!");
        }
    }
}
