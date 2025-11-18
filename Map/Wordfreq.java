package Map;

import java.util.*;

public class Wordfreq {
    public static void main(String[] args) {

        String sentence = "Java is fun and Java is powerful!";

        sentence = sentence.toLowerCase().replaceAll("[^a-z0-9 ]", "");

        String[] words = sentence.split("\\s+");

        Map<String, Integer> freq = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                freq.put(word, freq.getOrDefault(word, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
