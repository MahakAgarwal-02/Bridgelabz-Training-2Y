package constructors;

public class circle {

	double radius;

    circle() {
        this(1.0); 
    }

    circle(double r) {
        radius = r;
    }

    void display() {
        System.out.println("Radius: " + radius);
    }
	public static void main(String[] args) {

		circle c1 = new circle();     
        circle c2 = new circle(5.5);   
        
        c1.display();
        c2.display();

	}

}
