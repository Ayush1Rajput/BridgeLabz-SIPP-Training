import java.util.Scanner;

public class RemoveDuplicates {
    public static String removeDuplicateCharacters(String input) {
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if the character is already in the result string
            if (result.indexOf(currentChar) == -1) {
                result += currentChar;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String output = removeDuplicateCharacters(input);
        System.out.println("String after removing duplicates: " + output);

        scanner.close();
    }
}
