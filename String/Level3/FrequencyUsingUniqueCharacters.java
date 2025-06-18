import java.util.Scanner;

public class FrequencyUsingUniqueCharacters {
    public static void main(String[] args) {
        // Create Scanner class
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Get frequency of characters using unique characters
        String[][] frequencyTable = getFrequencyFromUniqueCharacters(input);

        // Display result in tabular format (using spaces, not escape sequences)
        System.out.println();
        System.out.println("Character    Frequency");
        for (int i = 0; i < frequencyTable.length; i++) {
            if (frequencyTable[i] != null) {
                String charStr = padRight(frequencyTable[i][0], 12);
                String freqStr = frequencyTable[i][1];
                System.out.println(charStr + freqStr);
            }
        }

        sc.close(); // Close scanner
    }

    // Method to find unique characters in the string
    public static char[] getUniqueCharacters(String str) {
        int length = getStringLength(str);
        char[] unique = new char[length];
        int uniqueIndex = 0;

        for (int i = 0; i < length; i++) {
            char current = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique[uniqueIndex++] = current;
            }
        }

        // Trim to actual unique count
        char[] result = new char[uniqueIndex];
        for (int i = 0; i < uniqueIndex; i++) {
            result[i] = unique[i];
        }

        return result;
    }

    // Method to find frequency using unique characters
    public static String[][] getFrequencyFromUniqueCharacters(String str) {
        int[] freq = new int[256]; // ASCII size
        int idx = 0;

        // Count frequency
        try {
            while (true) {
                char ch = str.charAt(idx++);
                freq[ch]++;
            }
        } catch (Exception e) {
            // End of string
        }

        // Get unique characters
        char[] uniqueChars = getUniqueCharacters(str);

        // Prepare 2D result array
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }

    // Method to find the length of the string without using length()
    public static int getStringLength(String str) {
        int len = 0;
        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (Exception e) {
            // End of string
        }
        return len;
    }

    // Method to pad string with spaces to align table
    public static String padRight(String str, int totalLength) {
        String result = str;
        while (getStringLength(result) < totalLength) {
            result = result + " ";
        }
        return result;
    }
}
