package Regex.ExtractionProblems;

import java.util.regex.*;

public class CapitalizedWordsExtractor {
    public static void main(String[] args) {
    	
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        String regex = "\\b[A-Z][a-zA-Z]*\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.print(matcher.group() + ", ");
        }
    }
}
