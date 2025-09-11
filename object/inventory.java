package object;
import java.util.*;

class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int code, String name, double p) {
        itemCode = code;
        itemName = name;
        price = p;
    }

    double totalCost(int quantity) {
        return price * quantity;
    }

    void display() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: ₹" + price);
    }
}

public class inventory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter item code: ");
        int code = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter item name: ");
        String name = sc.nextLine();

        System.out.print("Enter price of item: ");
        double price = sc.nextDouble();

        Item it = new Item(code, name, price);

        it.display();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        System.out.println("Total cost for " + qty + " " + it.itemName + "(s): ₹" + it.totalCost(qty));
	}

}
