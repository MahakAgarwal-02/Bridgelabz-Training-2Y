package key_words;

class Product {

    static double discount = 10.0; 

    private String productName;
    private double price;
    private int quantity;
    private final int productID; 
    
    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to " + discount + "%");
    }

    double calculateTotalPrice() {
        if (this instanceof Product) {  
            double total = price * quantity;
            double discountedTotal = total - (total * discount / 100);
            return discountedTotal;
        } else {
            System.out.println("Not a valid Product object.");
            return 0.0;
        }
    }

    void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total Price after Discount: " + calculateTotalPrice());
        } else {
            System.out.println("Invalid Product object.");
        }
    }
}
public class shopping {

	public static void main(String[] args) {
		Product p1 = new Product("Laptop", 50000, 1, 101);
        Product p2 = new Product("Headphones", 2000, 2, 102);

        p1.displayDetails();
        p2.displayDetails();

        Product.updateDiscount(20.0);

        p1.displayDetails();
        p2.displayDetails();
	}

}
