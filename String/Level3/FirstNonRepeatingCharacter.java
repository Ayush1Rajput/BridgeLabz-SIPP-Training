import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        // Create scanner class
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println();

        // Find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(input);

        // Display result
        if (result == 0) {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character is: " + result);
        }

        sc.close(); // Close scanner
    }

    // Method to find the first non-repeating character
    public static char findFirstNonRepeatingCharacter(String str) {
        int[] freq = new int[256]; // ASCII range

        // Count frequency of each character
        int index = 0;
        try {
            while (true) {
                char ch = str.charAt(index);
                freq[ch]++;
                index++;
            }
        } catch (Exception e) {
            // End of string
        }

        // Loop to find first non-repeating character
        index = 0;
        try {
            while (true) {
                char ch = str.charAt(index);
                if (freq[ch] == 1) {
                    return ch;
                }
                index++;
            }
        } catch (Exception e) {
            
        }

        return 0; // Indicating not found
    }
}
