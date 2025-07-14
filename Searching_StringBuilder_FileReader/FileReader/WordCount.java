package Searching_StringBuilder_FileReader.FileReader;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class WordCount {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the String : ");
        String targetWord = sc.nextLine();
        int count = 0;

        try {
            FileReader fileReader = new FileReader("example.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equals(targetWord)) {
                        count++;
                    }
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("The word \"" + targetWord + "\" appears " + count + " times.");
        sc.close();
    }
}
