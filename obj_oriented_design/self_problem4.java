package obj_oriented_design;

import java.util.ArrayList;

class Product {
 String name;
 double price;

 Product(String name, double price) {
     this.name = name;
     this.price = price;
 }

 void showProduct() {
     System.out.println("   Product: " + name + " | Price: $" + price);
 }
}

class Order {
 int orderId;
 Customer customer;             
 ArrayList<Product> products;   

 Order(int orderId, Customer customer) {
     this.orderId = orderId;
     this.customer = customer;
     this.products = new ArrayList<>();
 }


 void addProduct(Product product) {
     products.add(product);
 }

 void showOrderDetails() {
     System.out.println("\nOrder ID: " + orderId + " placed by " + customer.name);
     System.out.println("Products in this order:");
     double total = 0;
     for (Product p : products) {
         p.showProduct();
         total += p.price;
     }
     System.out.println("Total Amount: $" + total);
 }
}

class Customer {
 String name;
 ArrayList<Order> orders;  

 Customer(String name) {
     this.name = name;
     this.orders = new ArrayList<>();
 }

 Order placeOrder(int orderId) {
     Order order = new Order(orderId, this);
     orders.add(order);
     System.out.println(name + " placed Order ID: " + orderId);
     return order;
 }

 void showCustomerOrders() {
     System.out.println("\nCustomer: " + name + " has placed these orders:");
     for (Order o : orders) {
         System.out.println(" - Order ID: " + o.orderId);
     }
 }
}

public class self_problem4 {

	public static void main(String[] args) {
		Product p1 = new Product("Laptop", 1200);
        Product p2 = new Product("Headphones", 150);
        Product p3 = new Product("Keyboard", 80);

        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        Order o1 = c1.placeOrder(101);
        o1.addProduct(p1);
        o1.addProduct(p2);

        Order o2 = c1.placeOrder(102);
        o2.addProduct(p3);

        Order o3 = c2.placeOrder(201);
        o3.addProduct(p2);
        o3.addProduct(p3);

        c1.showCustomerOrders();
        c2.showCustomerOrders();

        o1.showOrderDetails();
        o2.showOrderDetails();
        o3.showOrderDetails();
	}

}
