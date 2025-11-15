package generics;

import java.util.*;

class Electronics {
 String name;
 Electronics(String name) { this.name = name; }

 @Override
 public String toString() {
     return "Electronics: " + name;
 }
}

class Clothing {
 String name;
 Clothing(String name) { this.name = name; }

 @Override
 public String toString() {
     return "Clothing: " + name;
 }
}

class Book {
 String title;
 Book(String title) { this.title = title; }

 @Override
 public String toString() {
     return "Book: " + title;
 }
}

class Cart<T> {
 private List<T> items = new ArrayList<>();

 public void addItem(T item) {
     items.add(item);
 }

 public void removeItem(T item) {
     items.remove(item);
 }

 public void displayItems() {
     System.out.println("Cart Items:");
     for (T item : items) {
         System.out.println(item);
     }
 }
}

public class genericCart {
 public static void main(String[] args) {

     Cart<Electronics> electronicsCart = new Cart<>();
     electronicsCart.addItem(new Electronics("Laptop"));
     electronicsCart.addItem(new Electronics("Smartphone"));
     System.out.println("Electronics Cart:");
     electronicsCart.displayItems();

     System.out.println();

 }}
