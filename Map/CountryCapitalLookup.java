package Map;

import java.util.*;

public class CountryCapitalLookup {
    public static void main(String[] args) {

        Map<String, String> capitals = new HashMap<>();

        capitals.put("India", "New Delhi");
        capitals.put("USA", "Washington D.C.");
        capitals.put("France", "Paris");
        capitals.put("Germany", "Berlin");
        capitals.put("Japan", "Tokyo");
        capitals.put("Australia", "Canberra");
        capitals.put("Canada", "Ottawa");
        capitals.put("Brazil", "Brasilia");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a country name: ");
        String country = sc.nextLine();

        if (capitals.containsKey(country)) {
            System.out.println("Capital: " + capitals.get(country));
        } else {
            System.out.println("Unknown country");
        }

        System.out.println("\nAll Countries (Alphabetically) with Capitals:");

        Map<String, String> sorted = new TreeMap<>(capitals);

        for (Map.Entry<String, String> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        sc.close();
    }
}