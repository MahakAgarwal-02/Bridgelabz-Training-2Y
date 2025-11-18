package Map;

import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {

        LinkedHashMap<String, Double> cart = new LinkedHashMap<>();

        cart.put("Laptop", 45000.0);
        cart.put("Mouse", 500.0);
        cart.put("Keyboard", 1200.0);
        cart.put("USB Cable", 300.0);
        cart.put("Headphones", 1500.0);

        cart.remove("USB Cable");

        System.out.println("=== Products in Cart (Insertion Order) ===");
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " → ₹" + entry.getValue());
        }

        double total = 0;
        for (double price : cart.values()) {
            total += price;
        }

        System.out.println("\nTotal (before discount): ₹" + total);

        if (total > 5000) {
            double discount = total * 0.10;
            total -= discount;
            System.out.println("10% discount applied: -₹" + discount);
        }

        System.out.println("\nFinal Payable Amount: ₹" + total);
    }
}