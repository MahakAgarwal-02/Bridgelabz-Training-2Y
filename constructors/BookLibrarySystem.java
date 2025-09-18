package constructors;

class LibraryBook {
    public String ISBN;       
    protected String title;   
    private String author;    

    LibraryBook(String isbn, String t, String a) {
        ISBN = isbn;
        title = t;
        author = a;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }
    
    public void displayBook() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }
}

class EBook extends LibraryBook {
    double fileSize;

    EBook(String isbn, String t, String a, double size) {
        super(isbn, t, a);
        fileSize = size;
    }

    public void displayEBookDetails() {

        System.out.println("EBook ISBN: " + ISBN + ", Title: " + title + ", File Size: " + fileSize + "MB");
    }
}

public class BookLibrarySystem {

	public static void main(String[] args) {

		LibraryBook b1 = new LibraryBook("978-0135166307", "Java Programming", "James Gosling");
        b1.displayBook();

        System.out.println("Current Author: " + b1.getAuthor());
        b1.setAuthor("Oracle Press");
        System.out.println("Updated Author: " + b1.getAuthor());

        EBook eb = new EBook("978-0135166307", "Java Programming (EBook)", "James Gosling", 5.6);
        eb.displayEBookDetails();
	}

}
