package constructors;

public class Book {

	String title;
    String author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
	public static void main(String[] args) {

		Book b1 = new Book(); // using default constructor
        Book b2 = new Book("Java Basics", "James Gosling", 499.99); // using parameterized constructor

        b1.display();
        b2.display();

	}

}
