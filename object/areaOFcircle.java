package object;
import java.util.*;
class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference());
    }
}
public class areaOFcircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        Circle c = new Circle(r);
        c.display();
	}

}
