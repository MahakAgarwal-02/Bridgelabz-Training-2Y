package interfacee;

interface PaymentProcessor {
 void pay(double amount);

 default void refund(double amount) {
     System.out.println("Refund of $" + amount + " is processed by default.");
 }
}

class PayPal implements PaymentProcessor {
 @Override
 public void pay(double amount) {
     System.out.println("PayPal payment of $" + amount + " completed.");
 }

}

class Stripe implements PaymentProcessor {
 @Override
 public void pay(double amount) {
     System.out.println("Stripe payment of $" + amount + " completed.");
 }

 @Override
 public void refund(double amount) {
     System.out.println("Stripe refund of $" + amount + " initiated.");
 }
}

class Razorpay implements PaymentProcessor {
 @Override
 public void pay(double amount) {
     System.out.println("Razorpay payment of $" + amount + " completed.");
 }
}

public class PaymentGatewayApp {
 public static void main(String[] args) {
     PaymentProcessor paypal = new PayPal();
     PaymentProcessor stripe = new Stripe();
     PaymentProcessor razorpay = new Razorpay();

     System.out.println("=== Payments ===");
     paypal.pay(100);
     stripe.pay(250);
     razorpay.pay(500);

     System.out.println("\n=== Refunds ===");
     paypal.refund(50);    
     stripe.refund(100);   
     razorpay.refund(200);
 }
}

