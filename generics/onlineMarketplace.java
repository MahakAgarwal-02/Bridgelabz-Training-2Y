package generics;

import java.util.*;


interface BookCategory {}
interface ClothingCategory {}
interface GadgetCategory {}



class Product<T> {

 private String name;
 private double price;
 private T category; 

 public Product(String name, double price, T category) {
     this.name = name;
     this.price = price;
     this.category = category;
 }

 public String getName() { return name; }
 public double getPrice() { return price; }
 public T getCategory() { return category; }

 public void setPrice(double price) {
     this.price = price;
 }

 @Override
 public String toString() {
     return name + " | ₹" + price + " | Category: " + category.getClass().getSimpleName();
 }
}



class Catalog {

 private List<Product<?>> products = new ArrayList<>();

 public void addProduct(Product<?> p) {
     products.add(p);
 }

 public void showCatalog() {
     System.out.println("\n===== PRODUCT CATALOG =====");
     for (Product<?> p : products) {
         System.out.println(p);
     }
 }
}



class DiscountUtil {

 public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
     double oldPrice = product.getPrice();
     double discountAmount = oldPrice * (percentage / 100);
     product.setPrice(oldPrice - discountAmount);

     System.out.println("Applied " + percentage + "% discount to " + product.getName());
 }
}



class Fiction implements BookCategory {}
class NonFiction implements BookCategory {}

class MenWear implements ClothingCategory {}
class WomenWear implements ClothingCategory {}

class MobileDevices implements GadgetCategory {}
class SmartHomeDevices implements GadgetCategory {}



public class onlineMarketplace {
 public static void main(String[] args) {

     Product<BookCategory> book1 = new Product<>("Harry Potter", 499, new Fiction());
     Product<BookCategory> book2 = new Product<>("Atomic Habits", 380, new NonFiction());

     Product<ClothingCategory> tshirt = new Product<>("T-Shirt", 799, new MenWear());
     Product<ClothingCategory> dress = new Product<>("Summer Dress", 1299, new WomenWear());

     Product<GadgetCategory> mobile = new Product<>("Smartphone", 25000, new MobileDevices());
     Product<GadgetCategory> bulb = new Product<>("Smart Bulb", 899, new SmartHomeDevices());


     DiscountUtil.applyDiscount(book1, 10);
     DiscountUtil.applyDiscount(dress, 20);
     DiscountUtil.applyDiscount(mobile, 5);


     Catalog catalog = new Catalog();
     catalog.addProduct(book1);
     catalog.addProduct(book2);
     catalog.addProduct(tshirt);
     catalog.addProduct(dress);
     catalog.addProduct(mobile);
     catalog.addProduct(bulb);

     catalog.showCatalog();
 }
}
