package Map;

import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "Hello world, hello Java!";

        text = text.toLowerCase().replaceAll("[^a-z0-9 ]", "");

        String[] words = text.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println(map);
    }
}