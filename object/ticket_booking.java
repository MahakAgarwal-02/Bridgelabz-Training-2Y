package object;
import java.util.Scanner;

class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    void bookTicket(String mName, String sNumber, double p) {
        movieName = mName;
        seatNumber = sNumber;
        price = p;
        System.out.println("Ticket booked successfully!");
    }

    void displayTicket() {
        System.out.println("\n--- Ticket Details ---");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }
}

public class ticket_booking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        MovieTicket ticket = new MovieTicket();

        System.out.print("Enter movie name: ");
        String movie = sc.nextLine();

        System.out.print("Enter seat number: ");
        String seat = sc.nextLine();

        System.out.print("Enter ticket price: ");
        double price = sc.nextDouble();

        ticket.bookTicket(movie, seat, price);

        ticket.displayTicket();
	}

}
