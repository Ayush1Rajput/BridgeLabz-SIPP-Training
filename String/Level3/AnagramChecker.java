import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // First check: lengths must be equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create arrays to store frequency of characters (assuming lowercase a-z)
        int[] freq1 = new int[256]; // For ASCII characters
        int[] freq2 = new int[256];

        // Count frequency of each character in text1
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
        }

        // Count frequency of each character in text2
        for (int i = 0; i < text2.length(); i++) {
            freq2[text2.charAt(i)]++;
        }

        // Compare both frequency arrays
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking first string input
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();

        // Taking second string input
        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        // Remove spaces and convert to lowercase for accurate comparison
        text1 = text1.replaceAll("\\s+", "").toLowerCase();
        text2 = text2.replaceAll("\\s+", "").toLowerCase();

        // Call method to check if they are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display result
        System.out.println("\nResult:");
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        scanner.close();
    }
}
