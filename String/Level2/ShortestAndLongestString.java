import java.util.Scanner;
import java.util.ArrayList;

public class ShortestAndLongestString {
    public static void main(String[] args) {
        // Create scanner class
        Scanner sc = new Scanner(System.in);

        // Taking the input
        System.out.print("Enter the text : ");
        String text = sc.nextLine();
        System.out.println();

        // Split the text into words manually
        String[] words = splitStringIntoWords(text);

        // Create 2D array with word and its length
        String[][] wordLengthArray = getWordsWithLengths(words);

        // Find the shortest and longest string indices
        int[] minMaxIndex = findShortestAndLongestWord(wordLengthArray);

        // Display the results
        System.out.println("Words with their lengths:");
        System.out.println("Word  "+"  Length");
        System.out.println();
        for (int i = 0; i < wordLengthArray.length; i++) {
            System.out.println(wordLengthArray[i][0] + "    " + wordLengthArray[i][1]);
        }

        System.out.println();
        System.out.println("Shortest Word : " + wordLengthArray[minMaxIndex[0]][0]);
        System.out.println("Longest Word  : " + wordLengthArray[minMaxIndex[1]][0]);

        sc.close(); // Close the scanner
    }

    // Method to split the text into words manually (without using split())
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

    // Method to find the shortest and longest word in 2D array
    public static int[] findShortestAndLongestWord(String[][] wordLengthArray) {
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < wordLengthArray.length; i++) {
            int currentLength = Integer.parseInt(wordLengthArray[i][1]);
            int minLength = Integer.parseInt(wordLengthArray[minIndex][1]);
            int maxLength = Integer.parseInt(wordLengthArray[maxIndex][1]);

            if (currentLength < minLength) {
                minIndex = i;
            }

            if (currentLength > maxLength) {
                maxIndex = i;
            }
        }

        return new int[] { minIndex, maxIndex };
    }
}
