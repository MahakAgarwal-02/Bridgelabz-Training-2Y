package object;
import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
    }

    double getCost() {
        return price * quantity;
    }

    void display() {
        System.out.println(itemName + " - ₹" + price + " x " + quantity + " = ₹" + getCost());
    }
}

public class shopping_cart {
	 static ArrayList<CartItem> cart = new ArrayList<>();

	    static void addItem(String name, double price, int qty) {
	        cart.add(new CartItem(name, price, qty));
	        System.out.println(name + " added to cart.");
	    }

	    static void removeItem(String name) {
	        boolean found = false;
	        for (int i = 0; i < cart.size(); i++) {
	            if (cart.get(i).itemName.equalsIgnoreCase(name)) {
	                cart.remove(i);
	                System.out.println(name + " removed from cart.");
	                found = true;
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("Item not found in cart.");
	        }
	    }

	    static void displayTotal() {
	        double total = 0;
	        System.out.println("\n--- Cart Items ---");
	        for (CartItem item : cart) {
	            item.display();
	            total += item.getCost();
	        }
	        System.out.println("Total Cost: ₹" + total);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n--- Shopping Cart Menu ---");
	            System.out.println("1. Add Item");
	            System.out.println("2. Remove Item");
	            System.out.println("3. View Cart & Total");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            sc.nextLine(); 

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter item name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Enter price: ");
	                    double price = sc.nextDouble();
	                    System.out.print("Enter quantity: ");
	                    int qty = sc.nextInt();
	                    addItem(name, price, qty);
	                    break;

	                case 2:
	                    System.out.print("Enter item name to remove: ");
	                    String removeName = sc.nextLine();
	                    removeItem(removeName);
	                    break;

	                case 3:
	                    displayTotal();
	                    break;

	                case 4:
	                    System.out.println("Thank you for shopping!");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }

	        } while (choice != 4);
	}

}
