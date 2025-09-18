package constructors;

public class CarRental {

	 String customerName;
	    String carModel;
	    int rentalDays;
	    double dailyRate;

	    CarRental() {
	        customerName = "Unknown";
	        carModel = "Standard";
	        rentalDays = 1;
	        dailyRate = 1000; 
	    }
	    
	    CarRental(String c, String m, int d, double rate) {
	        customerName = c;
	        carModel = m;
	        rentalDays = d;
	        dailyRate = rate;
	    }

	    double calculateCost() {
	        return rentalDays * dailyRate;
	    }

	    void display() {
	        System.out.println("Customer: " + customerName + ", Car: " + carModel +
	                ", Days: " + rentalDays + ", Total Cost: ₹" + calculateCost());
	    }
	public static void main(String[] args) {

		CarRental r1 = new CarRental();  
        CarRental r2 = new CarRental("Alice", "SUV", 5, 2000); 

        r1.display();
        r2.display();
	}

}
