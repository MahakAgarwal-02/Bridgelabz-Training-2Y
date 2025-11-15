package generics;
import java.util.*;

class Vehicle {
 String name;

 Vehicle(String name) {
     this.name = name;
 }

 public void show() {
     System.out.println("Vehicle: " + name);
 }
}

class Truck extends Vehicle {
 Truck(String name) {
     super(name);
 }

 @Override
 public void show() {
     System.out.println("Truck: " + name);
 }
}

class Bike extends Vehicle {
 Bike(String name) {
     super(name);
 }

 @Override
 public void show() {
     System.out.println("Bike: " + name);
 }
}

class FleetManager<T extends Vehicle> {

 private List<T> fleet = new ArrayList<>();

 public void addVehicle(T vehicle) {
     fleet.add(vehicle);
 }

 public void showFleet() {
     for (T v : fleet) {
         v.show();
     }
 }
}

public class fleetManager {
 public static void main(String[] args) {

     FleetManager<Truck> truckFleet = new FleetManager<>();
     truckFleet.addVehicle(new Truck("Volvo Heavy Truck"));
     truckFleet.addVehicle(new Truck("Tata Cargo Truck"));

     System.out.println("Truck Fleet:");
     truckFleet.showFleet();

     System.out.println();
     
     FleetManager<Bike> bikeFleet = new FleetManager<>();
     bikeFleet.addVehicle(new Bike("Royal Enfield"));
     bikeFleet.addVehicle(new Bike("Hero Splendor"));

     System.out.println("Bike Fleet:");
     bikeFleet.showFleet();

     
 }
}

