package collections;

import java.util.*;

class Order {
    int orderId;
    String customerName;

    public Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return orderId == order.orderId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }

    @Override
    public String toString() {
        return "OrderID: " + orderId + ", Customer: " + customerName;
    }
}

public class ECommerceSystem {
    public static void main(String[] args) {

        List<Order> allOrders = new ArrayList<>();
        allOrders.add(new Order(101, "Alice"));
        allOrders.add(new Order(102, "Bob"));
        allOrders.add(new Order(103, "Charlie"));
        allOrders.add(new Order(101, "Alice")); // duplicate
        allOrders.add(new Order(104, "David"));

        System.out.println("All Orders (with duplicates):");
        allOrders.forEach(System.out::println);

        Set<Order> uniqueOrders = new HashSet<>(allOrders);

        System.out.println("\nUnique Orders (duplicates removed):");
        uniqueOrders.forEach(System.out::println);

        Queue<Order> orderQueue = new LinkedList<>(uniqueOrders);

        Stack<Order> failedOrders = new Stack<>();

        System.out.println("\nProcessing Orders:");
        while (!orderQueue.isEmpty()) {
            Order current = orderQueue.poll();
            System.out.println("Processing: " + current);

            if (current.orderId == 103) {
                System.out.println("Order Failed → Added to Stack");
                failedOrders.push(current);
            }
        }

        System.out.println("\nRe-processing Failed Orders:");
        while (!failedOrders.isEmpty()) {
            Order retryOrder = failedOrders.pop();
            System.out.println("Reprocessing: " + retryOrder);
            System.out.println("Order Processed Successfully!");
        }
    }
}
