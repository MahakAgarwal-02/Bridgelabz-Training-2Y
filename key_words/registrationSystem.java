package key_words;

class Vehicle {

    static double registrationFee = 5000.0; 

    private String ownerName;
    private String vehicleType;
    private final String registrationNumber; 

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration Fee updated to: " + registrationFee);
    }

    void displayDetails() {
        if (this instanceof Vehicle) {  
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("Not a valid Vehicle object.");
        }
    }
}

public class registrationSystem {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Alice", "Car", "REG123");
        Vehicle v2 = new Vehicle("Bob", "Bike", "REG456");


        v1.displayDetails();
        v2.displayDetails();

        Vehicle.updateRegistrationFee(7000.0);

        v1.displayDetails();
        v2.displayDetails();		
	}

}
