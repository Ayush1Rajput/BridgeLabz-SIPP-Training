import java.util.Scanner;
import java.util.ArrayList;

public class WordsAndLengths2D {
    public static void main(String[] args) {
        // Create scanner class
        Scanner sc = new Scanner(System.in);

        // Taking the input
        System.out.print("Enter the String : ");
        String text = sc.nextLine();
        System.out.println();

        // Split the text into words manually using charAt()
        String[] words = splitStringIntoWords(text);

        // Create 2D array with word and its length
        String[][] wordLengthArray = getWordsWithLengths(words);

        // Display results in a tabular format
        System.out.println("Word  "+"  Length");
        System.out.println();
        for (int i = 0; i < wordLengthArray.length; i++) {
            String word = wordLengthArray[i][0];
            int len = Integer.parseInt(wordLengthArray[i][1]); // Convert String to int
            System.out.println(word +"    " + len);
        }

        sc.close(); // Close the scanner
    }

    // Method to split the text into words manually (without split())
    public static String[] splitStringIntoWords(String str) {
        ArrayList<String> wordList = new ArrayList<>();
        int i = 0;

        while (i < countTheLength(str)) {
            String temp = "";

            // Skip leading spaces
            while (i < countTheLength(str) && str.charAt(i) == ' ') {
                i++;
            }

            // Accumulate non-space characters as a word
            while (i < countTheLength(str) && str.charAt(i) != ' ') {
                temp += str.charAt(i);
                i++;
            }

            if (!temp.equals("")) {
                wordList.add(temp);
            }
        }

        return wordList.toArray(new String[0]);
    }

    // Method to count the length of a string without using length()
    public static int countTheLength(String str) {
        int countLength = 0;
        int idx = 0;

        while (true) {
            try {
                str.charAt(idx++);
                countLength++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        return countLength;
    }

    // Method to return a 2D array with words and their corresponding lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(countTheLength(words[i]));
        }

        return result;
    }
}
