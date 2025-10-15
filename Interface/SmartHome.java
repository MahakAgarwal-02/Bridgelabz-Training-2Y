package interfacee;

interface SmartDevice {
 void turnOn();   
 void turnOff();  
}

class Light implements SmartDevice {
 public void turnOn() {
     System.out.println("Light is now ON 💡");
 }

 public void turnOff() {
     System.out.println("Light is now OFF 💡");
 }
}

class AirConditioner implements SmartDevice {
 public void turnOn() {
     System.out.println("Air Conditioner is now ON ❄️");
 }

 public void turnOff() {
     System.out.println("Air Conditioner is now OFF ❄️");
 }
}

class Television implements SmartDevice {
 public void turnOn() {
     System.out.println("Television is now ON 📺");
 }

 public void turnOff() {
     System.out.println("Television is now OFF 📺");
 }
}

public class SmartHome {
 public static void main(String[] args) {

     SmartDevice light = new Light();
     SmartDevice ac = new AirConditioner();
     SmartDevice tv = new Television();

     light.turnOn();
     ac.turnOn();
     tv.turnOn();

     System.out.println("------------------------");

     light.turnOff();
     ac.turnOff();
     tv.turnOff();
 }
}

