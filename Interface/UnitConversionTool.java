package interfacee;


interface UnitConverter {

 static double kmToMiles(double km) {
     return km * 0.621371;
 }

 static double milesToKm(double miles) {
     return miles / 0.621371;
 }
 
 static double kgToLbs(double kg) {
     return kg * 2.20462;
 }

 static double lbsToKg(double lbs) {
     return lbs / 2.20462;
 }
}


@FunctionalInterface
interface Converter {
 void convert(double value);
}

public class UnitConversionTool {
 public static void main(String[] args) {

     System.out.println("=== OOP Style Conversion ===");

     double km = 10;
     double miles = UnitConverter.kmToMiles(km);
     System.out.println(km + " km = " + miles + " miles");

     double kg = 50;
     double lbs = UnitConverter.kgToLbs(kg);
     System.out.println(kg + " kg = " + lbs + " lbs");

     double m = 6.2;
     double k = UnitConverter.milesToKm(m);
     System.out.println(m + " miles = " + k + " km");

     double lb = 100;
     double kgs = UnitConverter.lbsToKg(lb);
     System.out.println(lb + " lbs = " + kgs + " kg");

     System.out.println("\n=== Functional Style Conversion (Using Lambda) ===");

     Converter kmToMilesLambda = (value) ->
             System.out.println(value + " km = " + UnitConverter.kmToMiles(value) + " miles");

     Converter kgToLbsLambda = (value) ->
             System.out.println(value + " kg = " + UnitConverter.kgToLbs(value) + " lbs");

     Converter milesToKmLambda = (value) ->
             System.out.println(value + " miles = " + UnitConverter.milesToKm(value) + " km");

     Converter lbsToKgLambda = (value) ->
             System.out.println(value + " lbs = " + UnitConverter.lbsToKg(value) + " kg");

     kmToMilesLambda.convert(5);
     kgToLbsLambda.convert(20);
     milesToKmLambda.convert(10);
     lbsToKgLambda.convert(45);
 }
}
