package constructors;

public class BOOKS {
	String title;
    String author;
    double price;
    boolean available;

    BOOKS(String t, String a, double p, boolean avail) {
        title = t;
        author = a;
        price = p;
        available = avail;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }

    public static void main(String[] args) {
        BOOKS b1 = new BOOKS("Java Basics", "James Gosling", 499.99, true);
        BOOKS b2 = new BOOKS("Python Guide", "Guido van Rossum", 399.99, false);

        b1.display();
        b1.borrowBook(); 
        b1.borrowBook();

        b2.display();
        b2.borrowBook(); 
    }
}
