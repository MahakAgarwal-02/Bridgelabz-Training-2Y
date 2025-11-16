package collections;

import java.util.*;

class Product {
    String name;
    double price;
    int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return name + " | Price: " + price + " | Stock: " + stock;
    }
}

public class InventorySystem {

    public static void main(String[] args) {

        Set<String> productNames = new HashSet<>();

        List<Product> productList = new ArrayList<>();

        Queue<Product> restockQueue = new LinkedList<>();

        Stack<Product> restockStack = new Stack<>();

        
        addProduct("Bread", 40, 2, productNames, productList);
        addProduct("Eggs", 60, 1, productNames, productList);
        addProduct("Milk", 50, 10, productNames, productList);
        addProduct("Bread", 40, 4, productNames, productList); // duplicate ignored

       
        for (Product p : productList) {
            if (p.stock < 5) {
                restockQueue.offer(p);
            }
        }

        System.out.println("\nProducts needing restock:");
        restockQueue.forEach(System.out::println);

      
        System.out.println("\nProcessing restock...");
        while (!restockQueue.isEmpty()) {
            Product p = restockQueue.poll();
            p.stock += 10;   
            restockStack.push(p);
            System.out.println("Restocked: " + p.name + " → New stock: " + p.stock);
        }

       
        System.out.println("\nUndo last restock operation:");
        if (!restockStack.isEmpty()) {
            Product last = restockStack.pop();
            last.stock -= 10;
            System.out.println("Undo Restock → " + last.name + " → Stock: " + last.stock);
        }

        
        System.out.println("\nFinal Product List:");
        productList.forEach(System.out::println);
    }

    static void addProduct(String name, double price, int stock,
                           Set<String> productNames, List<Product> productList) {

        if (productNames.contains(name)) {
            System.out.println("Duplicate product ignored: " + name);
            return;
        }

        productNames.add(name);
        productList.add(new Product(name, price, stock));
        System.out.println("Product added: " + name);
    }
}
