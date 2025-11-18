package Map;

import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);

        HashMap<Integer, List<String>> inverted = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            inverted.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        System.out.println(inverted);
    }
}