package interfacee;

class Vehicle implements Cloneable {
 private String type;
 private String model;
 private int speed;

 public Vehicle(String type, String model, int speed) {
     this.type = type;
     this.model = model;
     this.speed = speed;
 }

 public String getType() { return type; }
 public String getModel() { return model; }
 public int getSpeed() { return speed; }

 @Override
 protected Object clone() throws CloneNotSupportedException {
     return super.clone(); 
 }

 public void displayInfo() {
     System.out.println(type + " | " + model + " | " + speed + " km/h");
 }
}

public class ClonePrototypeExample {
 public static void main(String[] args) {
     try {
         Vehicle car = new Vehicle("Car", "Sedan", 120);
         System.out.println("Original Vehicle:");
         car.displayInfo();

         Vehicle clonedCar = (Vehicle) car.clone();
         System.out.println("Cloned Vehicle:");
         clonedCar.displayInfo();

     } catch (CloneNotSupportedException e) {
         System.out.println("Clone not supported for this object!");
     }
 }
}
