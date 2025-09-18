package constructors;

class BankAccount {
    public String accountNumber;    
    protected String accountHolder; 
    private double balance;         

    BankAccount(String accNo, String holder, double bal) {
        accountNumber = accNo;
        accountHolder = holder;
        balance = bal;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient balance.");
        }
    }

    public void displayAccount() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accNo, String holder, double bal, double rate) {
        super(accNo, holder, bal);
        interestRate = rate;
    }

    public void displaySavingsDetails() {
        System.out.println("Savings Account No: " + accountNumber + ", Holder: " + accountHolder + ", Interest Rate: " + interestRate + "%");
    }
}
public class BankAccountManagement {

	public static void main(String[] args) {
		 BankAccount acc1 = new BankAccount("12345", "Alice", 5000);
	        acc1.displayAccount();

	        acc1.deposit(2000);
	        acc1.withdraw(1500);
	        System.out.println("Final Balance: " + acc1.getBalance());

	        SavingsAccount sa = new SavingsAccount("67890", "Bob", 8000, 4.5);
	        sa.displaySavingsDetails();
	}

}
