import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        // Create scanner class
        Scanner sc = new Scanner(System.in);

        // Taking the input
        System.out.print("Enter the string : ");
        String text = sc.nextLine();
        System.out.println();

        // Call the method to count vowels and consonants
        int[] result = countVowelsAndConsonants(text);

        // Display the result
        System.out.println("Total Vowels : " + result[0]);
        System.out.println("Total Consonants : " + result[1]);

        sc.close(); // Close the scanner
    }

    // Method to count the length of a string without using length()
    public static int countLength(String str) {
        int count = 0;
        int idx = 0;
        while (true) {
            try {
                str.charAt(idx++);
                count++;
            } catch (Exception e) {
                break;
            }
        }
        return count;
    }

    // Method to check if the character is vowel/consonant
    public static String checkCharType(char ch) {
        // Convert to lowercase manually using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); // Convert to lowercase
        }

        // Check if it's a letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to count vowels and consonants
    public static int[] countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < countLength(str); i++) {
            char currentChar = str.charAt(i);
            String type = checkCharType(currentChar);

            if (type.equals("Vowel")) {
                vowelCount++;
            } else if (type.equals("Consonant")) {
                consonantCount++;
            }
        }

        return new int[] { vowelCount, consonantCount };
    }
}
