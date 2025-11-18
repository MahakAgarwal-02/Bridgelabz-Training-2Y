package Map;

import java.util.*;

public class InventoryManager {
    public static void main(String[] args) {

        Map<String, Integer> inventory = new HashMap<>();

        inventory.put("Soap", 50);
        inventory.put("Shampoo", 30);
        inventory.put("Rice", 100);
        inventory.put("Oil", 20);

        buyProduct(inventory, "Soap", 10);     
        buyProduct(inventory, "Oil", 25);      
        buyProduct(inventory, "Rice", 40);     

        addShipment(inventory, "Oil", 50);     
        addShipment(inventory, "Shampoo", 10); 

        queryProduct(inventory, "Soap");
        queryProduct(inventory, "Oil");
        queryProduct(inventory, "Bread"); 

        System.out.println("\nOut of Stock Products:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() == 0) {
                System.out.println(entry.getKey());
            }
        }
    }

    static void buyProduct(Map<String, Integer> inventory, String product, int qty) {
        if (!inventory.containsKey(product)) {
            System.out.println(product + " not stocked.");
            return;
        }

        int current = inventory.get(product);
        int newQty = current - qty;

        if (newQty <= 0) {
            inventory.put(product, 0); 
            System.out.println(product + " is now OUT OF STOCK.");
        } else {
            inventory.put(product, newQty);
            System.out.println(qty + " units of " + product + " sold. Remaining: " + newQty);
        }
    }

    static void addShipment(Map<String, Integer> inventory, String product, int qty) {
        int current = inventory.getOrDefault(product, 0);
        inventory.put(product, current + qty);
        System.out.println("Shipment added: " + product + " now has " + (current + qty));
    }

    static void queryProduct(Map<String, Integer> inventory, String product) {
        if (!inventory.containsKey(product)) {
            System.out.println(product + " is not stocked.");
        } else {
            System.out.println(product + " remaining: " + inventory.get(product));
        }
    }
}
