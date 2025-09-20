package obj_oriented_design;
import java.util.ArrayList;

class Book {
 String title;
 String author;

 Book(String title, String author) {
     this.title = title;
     this.author = author;
 }

 void displayBook() {
     System.out.println("Title: " + title + ", Author: " + author);
 }
}

class Library {
 String name;
 ArrayList<Book> books;  

 Library(String name) {
     this.name = name;
     this.books = new ArrayList<>();
 }

 void addBook(Book book) {
     books.add(book);
 }

 void showLibraryBooks() {
     System.out.println("Library: " + name);
     for (Book b : books) {
         b.displayBook();
     }
     System.out.println();
 }
}

public class problem1 {

	public static void main(String[] args) {
		 Book b1 = new Book("The Hobbit", "J.R.R. Tolkien");
	        Book b2 = new Book("1984", "George Orwell");
	        Book b3 = new Book("Clean Code", "Robert C. Martin");

	        Library lib1 = new Library("City Library");
	        Library lib2 = new Library("University Library");

	        lib1.addBook(b1);
	        lib1.addBook(b2);

	        lib2.addBook(b2); 
	        lib2.addBook(b3);

	        lib1.showLibraryBooks();
	        lib2.showLibraryBooks();

	}

}
