import java.util.Scanner;

public class MostFrequentCharacter {
    public static char findMostFrequentChar(String input) {
        int maxCount = 0;
        char mostFrequent = '\0'; // null character
        input = input.toLowerCase(); 

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            int count = 0;

            // Count occurrences of current character
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == current) {
                    count++;
                }
            }

            // Update maxCount and mostFrequent if needed
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = current;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char result = findMostFrequentChar(input);
        System.out.println("Most Frequent Character: '" + result + "'");

        scanner.close();
    }
}
