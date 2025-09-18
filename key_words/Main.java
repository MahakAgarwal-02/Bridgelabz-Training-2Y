package key_words;

class BankAccount {
    static String bankName = "MyBank";

    private static int totalAccounts = 0;

    private String accountHolderName;
    private final int accountNumber;   

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName; 
        this.accountNumber = accountNumber; 
        totalAccounts++;  
    }


    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayDetails() {

        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("Not a valid BankAccount object.");
        }
    }
}

public class Main {

	public static void main(String[] args) {
		
		 BankAccount acc1 = new BankAccount("Alice", 1001);
	        BankAccount acc2 = new BankAccount("Bob", 1002);

	        acc1.displayDetails();
	        acc2.displayDetails();

	        BankAccount.getTotalAccounts();
	}

}
