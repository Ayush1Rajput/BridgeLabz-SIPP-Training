package Collector.WordFrequencyCounter;

import java.util.*;
import java.util.stream.*;

public class WordFrequency {
    public static void main(String[] args) {
        String paragraph = "Sports bring people together and sports inspire people";
        String[] words = paragraph.toLowerCase().split("\\s+");

        Map<String, Long> wordCount = Arrays.stream(words)
            .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        System.out.println(wordCount);
    }
}
