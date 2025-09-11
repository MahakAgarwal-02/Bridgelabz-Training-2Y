package object;
import java.util.*;

class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }
}

public class phone_details {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter phone brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter phone model: ");
        String model = sc.nextLine();

        System.out.print("Enter phone price: ");
        double price = sc.nextDouble();

        MobilePhone phone = new MobilePhone(brand, model, price);

        System.out.println("\nMobile Phone Details:");
        phone.display();

	}

}
