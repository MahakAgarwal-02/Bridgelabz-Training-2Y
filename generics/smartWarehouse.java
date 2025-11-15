package generics;

import java.util.*;

abstract class Item {
 private String name;
 private double price;

 Item(String name, double price) {
     this.name = name;
     this.price = price;
 }

 public String getName() { return name; }
 public double getPrice() { return price; }

 @Override
 public String toString() {
     return name + " (₹" + price + ")";
 }
}

class Electronics extends Item {
 Electronics(String name, double price) {
     super(name, price);
 }
}

class Groceries extends Item {
 Groceries(String name, double price) {
     super(name, price);
 }
}

class Furniture extends Item {
 Furniture(String name, double price) {
     super(name, price);
 }
}


class Warehouse<T extends Item> {

 private List<T> items = new ArrayList<>();

 public void addItem(T item) {
     items.add(item);
     System.out.println(item.getName() + " added to warehouse.");
 }

 public void removeItem(T item) {
     items.remove(item);
     System.out.println(item.getName() + " removed from warehouse.");
 }

 public void showItems() {
     System.out.println("\nWarehouse Items:");
     for (T item : items) {
         System.out.println("- " + item);
     }
 }

 public static double calculateTotalPrice(List<? extends Item> list) {
     double total = 0;
     for (Item item : list) {
         total += item.getPrice();
     }
     return total;
 }
}


public class smartWarehouse {
 public static void main(String[] args) {

     Warehouse<Electronics> electronicsWarehouse = new Warehouse<>();
     electronicsWarehouse.addItem(new Electronics("Laptop", 60000));
     electronicsWarehouse.addItem(new Electronics("Camera", 30000));
     electronicsWarehouse.showItems();

     Warehouse<Groceries> groceriesWarehouse = new Warehouse<>();
     groceriesWarehouse.addItem(new Groceries("Rice Bag", 1200));
     groceriesWarehouse.addItem(new Groceries("Milk Pack", 60));
     groceriesWarehouse.showItems();

     Warehouse<Furniture> furnitureWarehouse = new Warehouse<>();
     furnitureWarehouse.addItem(new Furniture("Chair", 1500));
     furnitureWarehouse.addItem(new Furniture("Dining Table", 7000));
     furnitureWarehouse.showItems();

    
     double electronicsTotal = Warehouse.calculateTotalPrice(
             Arrays.asList(
                     new Electronics("TV", 45000),
                     new Electronics("Soundbar", 15000)
             )
     );

     System.out.println("\nTotal cost of electronics list: ₹" + electronicsTotal);

     double furnitureTotal = Warehouse.calculateTotalPrice(
             Arrays.asList(
                     new Furniture("Sofa", 25000),
                     new Furniture("Bed", 30000)
             )
     );

     System.out.println("Total cost of furniture list: ₹" + furnitureTotal);

     
 }
}
