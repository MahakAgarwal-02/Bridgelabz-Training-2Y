package constructors;

public class Vehicle {
	String ownerName;
    String vehicleType;

    static double registrationFee = 5000;

    Vehicle(String owner, String type) {
        ownerName = owner;
        vehicleType = type;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle: " + vehicleType +
                ", Registration Fee: ₹" + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: ₹" + registrationFee);
    }

	public static void main(String[] args) {

		Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Motorbike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(6000);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
	}

}
