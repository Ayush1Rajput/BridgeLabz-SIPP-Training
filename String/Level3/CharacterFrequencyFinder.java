import java.util.Scanner;

public class CharacterFrequencyFinder {

    // Method to calculate frequency of characters in the given text
    public static String[] findCharFrequencies(String inputText) {
        char[] charArray = inputText.toCharArray(); // Convert the input text to character array
        int[] frequency = new int[charArray.length]; // Array to store frequency of each character

        // Outer loop to check each character
        for (int i = 0; i < charArray.length; i++) {
            frequency[i] = 1; // Initialize frequency

            // Skip if character is already counted
            if (charArray[i] == '0')
                continue;

            // Inner loop to find duplicates
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    frequency[i]++;
                    charArray[j] = '0'; // Mark duplicate as visited
                }
            }
        }

        // Create result array to store character and frequency as String
        String[] result = new String[charArray.length];
        int index = 0;

        for (int i = 0; i < charArray.length; i++) {
            // Skip if marked as '0'
            if (charArray[i] != '0') {
                result[index] = "'" + charArray[i] + "' appears " + frequency[i] + " times";
                index++;
            }
        }

        // Return only non-null elements
        String[] finalResult = new String[index];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the text
        System.out.print("Enter a string to find character frequencies: ");
        String inputText = scanner.nextLine();

        // Call the method to find frequencies
        String[] frequencyResult = findCharFrequencies(inputText);

        // Display the result
        System.out.println("\nCharacter Frequencies:");
        for (String s : frequencyResult) {
            System.out.println(s);
        }

        scanner.close();
    }
}
