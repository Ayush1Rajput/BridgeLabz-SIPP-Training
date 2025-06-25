public class WordReplacer {

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String result = "";
        String word = "";
        
        // Append a space at the end to handle the last word
        sentence += " ";

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {
                if (word.equals(oldWord)) {
                    result += newWord + " ";
                } else {
                    result += word + " ";
                }
                word = ""; // reset for next word
            }
        }

        // Trim the extra space at the end
        return result.trim();
    }

    public static void main(String[] args) {
        String sentence = "the cat sat on the mat";
        String oldWord = "the";
        String newWord = "a";

        String modifiedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified Sentence: " + modifiedSentence);
    }
}
