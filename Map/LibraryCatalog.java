package Map;

import java.util.*;

public class LibraryCatalog {
    public static void main(String[] args) {

        Map<String, String> catalog = new HashMap<>();

        catalog.put("978-1234567890", "The Java Handbook");
        catalog.put("978-1111111111", "Data Structures Guide");
        catalog.put("978-2222222222", "Introduction to Algorithms");
        catalog.put("978-3333333333", "Operating Systems Explained");

        searchByISBN(catalog, "978-1111111111");
        searchByISBN(catalog, "978-9999999999"); // Not found

        catalog.remove("978-3333333333");

        System.out.println("\nLibrary Catalog (Sorted by ISBN):");
        Map<String, String> sorted = new TreeMap<>(catalog);

        for (Map.Entry<String, String> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        searchByTitle(catalog, "Algorithms");
        searchByTitle(catalog, "Python");
    }

    static void searchByISBN(Map<String, String> catalog, String isbn) {
        if (catalog.containsKey(isbn)) {
            System.out.println("ISBN found → " + isbn + " : " + catalog.get(isbn));
        } else {
            System.out.println("Book not found for ISBN: " + isbn);
        }
    }

    static void searchByTitle(Map<String, String> catalog, String titlePart) {
        System.out.println("\nSearching for title containing: " + titlePart);

        boolean found = false;
        for (Map.Entry<String, String> entry : catalog.entrySet()) {
            if (entry.getValue().toLowerCase().contains(titlePart.toLowerCase())) {
                System.out.println(entry.getKey() + " → " + entry.getValue());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found with title containing: " + titlePart);
        }
    }
}