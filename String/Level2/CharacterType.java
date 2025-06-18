import java.util.Scanner;

public class CharacterType {
    public static void main(String[] args) {
        // Create scanner class
        Scanner sc = new Scanner(System.in);

        // Taking the input
        System.out.print("Enter the string : ");
        String input = sc.nextLine();
        System.out.println();

        // Get character classification in 2D array
        String[][] result = classifyCharacters(input);

        // Display the result in tabular format
        displayCharacterTable(result);

        sc.close(); // Close the scanner
    }

    // Method to count length of a string without using length()
    public static int countLength(String str) {
        int count = 0;
        int index = 0;

        while (true) {
            try {
                str.charAt(index++);
                count++;
            } catch (Exception e) {
                break;
            }
        }

        return count;
    }

    // Method to classify a character
    public static String classifyCharacter(char ch) {
        // Convert to lowercase using ASCII if uppercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); // A-Z to a-z
        }

        // Check if it's an alphabet
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to classify each character in string and return 2D array
    public static String[][] classifyCharacters(String str) {
        int len = countLength(str);
        String[][] result = new String[len][2];

        for (int i = 0; i < len; i++) {
            char currentChar = str.charAt(i);
            result[i][0] = String.valueOf(currentChar);
            result[i][1] = classifyCharacter(currentChar);
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayCharacterTable(String[][] table) {
        System.out.println("Character    Type");
        System.out.println();

        for (int i = 0; i < table.length; i++) {
            System.out.println("   " + table[i][0] + "    " + table[i][1]);
        }
    }
}
