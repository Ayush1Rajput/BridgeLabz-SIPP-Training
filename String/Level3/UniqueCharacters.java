import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        // Create scanner class
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println();
        // Find length without using length() method
        int length = findLength(input);

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(input, length);

        // Display result
        System.out.println("Unique characters in the string are:");
        for (int i = 0; i < uniqueChars.length; i++) {
            System.out.print(uniqueChars[i] + " ");
        }

        sc.close(); // Close scanner
    }

    // Method to find the length of a string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // End of string reached
        }
        return count;
    }

    // Method to find unique characters in a string using charAt()
    public static char[] findUniqueCharacters(String str, int length) {
        char[] temp = new char[length]; // to store unique characters
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char current = str.charAt(i);
            boolean isUnique = true;

            // Check if current character is already in temp[]
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == current) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add to temp[]
            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Create final array of only unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}
