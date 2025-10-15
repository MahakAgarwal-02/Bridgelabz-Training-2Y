package interfacee;

interface Vehicle {
 void displaySpeed(); 

 default void displayBattery() {
     System.out.println("Battery info not available for this vehicle.");
 }
}

class Car implements Vehicle {
 @Override
 public void displaySpeed() {
     System.out.println("Car speed: 120 km/h");
 }
}

class Bike implements Vehicle {
 @Override
 public void displaySpeed() {
     System.out.println("Bike speed: 80 km/h");
 }
}

class ElectricCar implements Vehicle {
 private int batteryPercentage;

 public ElectricCar(int batteryPercentage) {
     this.batteryPercentage = batteryPercentage;
 }

 @Override
 public void displaySpeed() {
     System.out.println("Electric Car speed: 100 km/h");
 }

 @Override
 public void displayBattery() {
     System.out.println("Electric Car battery: " + batteryPercentage + "%");
 }
}

public class SmartVehicleDashboard {
 public static void main(String[] args) {
     Vehicle car = new Car();
     Vehicle bike = new Bike();
     Vehicle electricCar = new ElectricCar(85);

     System.out.println("=== Display Speeds ===");
     car.displaySpeed();
     bike.displaySpeed();
     electricCar.displaySpeed();

     System.out.println("\n=== Display Battery Info ===");
     car.displayBattery();        
     bike.displayBattery();        
     electricCar.displayBattery(); 
 }
}
