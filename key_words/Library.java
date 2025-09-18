package key_words;

class Book {

    static String libraryName = "City Central Library";

    private String title;
    private String author;
    private final String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void displayDetails() {

        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Not a valid Book object.");
        }
    }

    String getIsbn() {
        if (this instanceof Book) {
            return isbn;
        } else {
            return "Invalid Book Object";
        }
    }
}

public class Library {

	public static void main(String[] args) {
		Book.displayLibraryName();

        Book b1 = new Book("The Alchemist", "Paulo Coelho", "ISBN001");
        Book b2 = new Book("1984", "George Orwell", "ISBN002");

        b1.displayDetails();
        b2.displayDetails();

        System.out.println("Returned ISBN: " + b1.getIsbn());
	}

}
