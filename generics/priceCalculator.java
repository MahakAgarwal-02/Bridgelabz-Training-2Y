package generics;

import java.util.*;

abstract class Product {
 private double price;

 public Product(double price) {
     this.price = price;
 }

 public double getPrice() {
     return price;
 }
}

class Mobile extends Product {
 private String model;

 public Mobile(String model, double price) {
     super(price);
     this.model = model;
 }

 @Override
 public String toString() {
     return "Mobile: " + model + " (₹" + getPrice() + ")";
 }
}

class Laptop extends Product {
 private String brand;

 public Laptop(String brand, double price) {
     super(price);
     this.brand = brand;
 }

 @Override
 public String toString() {
     return "Laptop: " + brand + " (₹" + getPrice() + ")";
 }
}

public class priceCalculator {

 public static double calculateTotal(List<? extends Product> items) {
     double total = 0;
     for (Product p : items) {
         total += p.getPrice();
     }
     return total;
 }

 public static void main(String[] args) {

     List<Mobile> mobiles = Arrays.asList(
             new Mobile("Samsung", 25000),
             new Mobile("iPhone", 70000)
     );

     List<Laptop> laptops = Arrays.asList(
             new Laptop("HP", 55000),
             new Laptop("Dell", 60000)
     );

     System.out.println("Mobile List:");
     mobiles.forEach(System.out::println);
     System.out.println("Total Mobile Price = ₹" + calculateTotal(mobiles));

     System.out.println();

     System.out.println("Laptop List:");
     laptops.forEach(System.out::println);
     System.out.println("Total Laptop Price = ₹" + calculateTotal(laptops));
 }
}

