package Regex.ReplaceAndModifyStrings;

public class WordReplacer {
	
    public static void main(String[] args) {
    	
        String input = "This is a damn bad example with some stupid words.";
        String output = input.replaceAll("\\bdamn\\b", "****").replaceAll("\\bstupid\\b", "****");

        System.out.println(output);
    }
}
