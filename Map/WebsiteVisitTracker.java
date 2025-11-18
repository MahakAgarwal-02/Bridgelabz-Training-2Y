package Map;

import java.util.*;

public class WebsiteVisitTracker {
    public static void main(String[] args) {

        Map<String, Integer> visitMap = new HashMap<>();

        String[] visits = {
            "home", "about", "products", "home", "products",
            "contact", "home", "blog", "home", "products"
        };

        for (String page : visits) {
            visitMap.put(page, visitMap.getOrDefault(page, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedList =
                new ArrayList<>(visitMap.entrySet());

        sortedList.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("=== Page Visit Count (Descending) ===");
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        Map.Entry<String, Integer> mostVisited = sortedList.get(0);
        System.out.println("\nMost Visited Page: " +
                mostVisited.getKey() + " (" + mostVisited.getValue() + " visits)");
    }
}
