package obj_oriented_design;

import java.util.ArrayList;

class Bank {
 String name;
 ArrayList<Customer> customers;  

 Bank(String name) {
     this.name = name;
     this.customers = new ArrayList<>();
 }

 void openAccount(Customer customer) {
     customers.add(customer);
     System.out.println("Account opened for " + customer.name + " in " + name);
 }

 void showCustomers() {
     System.out.println("Bank: " + name + " has the following customers:");
     for (Customer c : customers) {
         System.out.println("- " + c.name);
     }
     System.out.println();
 }
}

class Customer {
 String name;
 double balance;
 Bank bank;  

 Customer(String name, double balance, Bank bank) {
     this.name = name;
     this.balance = balance;
     this.bank = bank;
 }

 void viewBalance() {
     System.out.println(name + " has a balance of $" + balance + " in " + bank.name);
 }
}
public class problem2 {

	public static void main(String[] args) {
		Bank bank1 = new Bank("State Bank");
        Bank bank2 = new Bank("National Bank");

        Customer c1 = new Customer("Alice", 5000, bank1);
        Customer c2 = new Customer("Bob", 3000, bank1);
        Customer c3 = new Customer("Charlie", 8000, bank2);

        bank1.openAccount(c1);
        bank1.openAccount(c2);
        bank2.openAccount(c3);

        bank1.showCustomers();
        bank2.showCustomers();

        c1.viewBalance();
        c2.viewBalance();
        c3.viewBalance();
	}

}
