package Regex.ExtractionProblems;

import java.util.regex.*;

public class URLExtractor {
    public static void main(String[] args) {
    	
        String text = "Visit https://www.google.com and http://example.org for more info.";
        String regex = "\\bhttps?://[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)+\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
