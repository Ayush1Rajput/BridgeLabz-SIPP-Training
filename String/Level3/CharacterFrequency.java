import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        // Create scanner class
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call method to get character frequency
        String[][] freqTable = getCharacterFrequency(input);

        // Display result in tabular format
        System.out.println("Character    Frequency");
        for (int i = 0; i < freqTable.length; i++) {
            if (freqTable[i] != null) {
                System.out.println("   " + freqTable[i][0] + "    " + freqTable[i][1]);
            }
        }

        sc.close(); // Close scanner
    }

    // Method to get frequency of characters in the string
    public static String[][] getCharacterFrequency(String str) {
        int[] freq = new int[256]; // ASCII array to count frequency

        // Count character frequency using charAt()
        int index = 0;
        try {
            while (true) {
                char ch = str.charAt(index);
                freq[ch]++;
                index++;
            }
        } catch (Exception e) {
            
        }

        // Create 2D array for storing character and frequency
        String[][] result = new String[str.length()][2];
        boolean[] visited = new boolean[256]; // To avoid duplicates
        int resIndex = 0;

        index = 0;
        try {
            while (true) {
                char ch = str.charAt(index);
                if (!visited[ch]) {
                    result[resIndex][0] = String.valueOf(ch);
                    result[resIndex][1] = String.valueOf(freq[ch]);
                    visited[ch] = true;
                    resIndex++;
                }
                index++;
            }
        } catch (Exception e) {
            
        }

        return result;
    }
}
