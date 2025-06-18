import java.util.Scanner;

public class LowerCaseCompare {
     public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take full line input from user
        System.out.print("Enter the complete text: ");
        String originalText = sc.nextLine();

        // Call method to convert text to lowercase using ASCII logic
        String manualLower = convertToLowerCase(originalText);

        // Use built-in method to convert to lowercase
        String builtInLower = originalText.toLowerCase();

        System.out.println();

        // Display both results
        System.out.println("lowercase using user-defined method: " + manualLower);
        System.out.println("lowercase using built-in method: " + builtInLower);

        System.out.println();

        // Compare both results using character-by-character method
        boolean isSame = compareStrings(manualLower, builtInLower);

        if (isSame) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        sc.close(); // close scanner
    }

    // Method to convert uppercase characters to lowercase manually
    public static String convertToLowerCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is uppercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32); // Convert to lowercase using ASCII logic
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
