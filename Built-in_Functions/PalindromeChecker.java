import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        String inputText = takeInput(sc);

        // Check if the input is a palindrome
        boolean isPalindrome = checkPalindrome(inputText);

        // Display the result
        displayResult(inputText, isPalindrome);

        sc.close();
    }

    // Method to take input from the user
    static String takeInput(Scanner sc) {
        System.out.print("Enter a word or phrase to check if it's a palindrome: ");
        String text = sc.nextLine().trim();
        System.out.println();
        return text;
    }

    // Method to check if the string is a palindrome
    static boolean checkPalindrome(String text) {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Remove non-alphanumerics and convert to lowercase
        int left = 0;
        int right = cleanedText.length() - 1;

        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // Method to display the result
    static void displayResult(String originalText, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("The input \"" + originalText + "\" is a palindrome.");
        } else {
            System.out.println("The input \"" + originalText + "\" is NOT a palindrome.");
        }
        System.out.println();
    }
}
