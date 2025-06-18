import java.util.*;

public class UpperCaseCompare {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take full line input from user
        System.out.print("Enter the complete text: ");
        String originalText = sc.nextLine();

        // Call method to convert text to uppercase using ASCII logic
        String manualUpper = convertToUpperCase(originalText);

        // Use built-in method to convert to uppercase
        String builtInUpper = originalText.toUpperCase();

        System.out.println();

        // Display both results
        System.out.println("Uppercase using user-defined method: " + manualUpper);
        System.out.println("Uppercase using built-in method:     " + builtInUpper);

        System.out.println();

        // Compare both results using character-by-character method
        boolean isSame = compareStrings(manualUpper, builtInUpper);

        if (isSame) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        sc.close(); // close scanner
    }

    // Method to convert lowercase characters to uppercase manually
    public static String convertToUpperCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is lowercase
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32); // Convert to uppercase using ASCII logic
            }

            result += ch;
        }

        return result;
    }

    // Method to compare two strings character-by-character
    public static boolean compareStrings(String str1, String str2) {

        // First check length
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
