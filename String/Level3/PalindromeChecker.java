import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Using loop with start and end index
    public static boolean isPalindromeByIndex(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method to check palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Helper method to reverse a string using charAt()
    public static char[] reverseString(String text) {
        char[] reversed = new char[text.length()];
        int j = 0;
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed[j] = text.charAt(i);
            j++;
        }
        return reversed;
    }

    // Logic 3: Compare character array and reversed array
    public static boolean isPalindromeByCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < text.length(); i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string to check if it's a palindrome: ");
        String inputText = scanner.nextLine();

        // Remove spaces and convert to lowercase for better palindrome checking
        String cleanText = inputText.replaceAll("\\s+", "").toLowerCase();

        // Using Logic 1
        boolean result1 = isPalindromeByIndex(cleanText);

        // Using Logic 2
        boolean result2 = isPalindromeRecursive(cleanText, 0, cleanText.length() - 1);

        // Using Logic 3
        boolean result3 = isPalindromeByCharArray(cleanText);

        // Display the results
        System.out.println("\nPalindrome Check Results:");
        System.out.println("Using index comparison : " + (result1 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using recursion : " + (result2 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using character array match : " + (result3 ? "Palindrome" : "Not a Palindrome"));

        scanner.close();
    }
}
