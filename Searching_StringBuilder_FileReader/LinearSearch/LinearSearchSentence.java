package Searching_StringBuilder_FileReader.LinearSearch;

public class LinearSearchSentence {
    public static void main(String[] args) {
        String[] sentences = {
            "The sun rises in the east.",
            "Java is a popular programming language.",
            "Artificial Intelligence is the future.",
            "Stay healthy and exercise regularly."
        };

        String targetWord = "Java";
        String result = "Not Found";

        for (String sentence : sentences) {
            if (sentence.contains(targetWord)) {
                result = sentence;
                break;
            }
        }

        System.out.println(result);
    }
}
