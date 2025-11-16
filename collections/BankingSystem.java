package collections;

import java.util.*;

class Account {
 int accountId;
 double balance;

 public Account(int accountId, double balance) {
     this.accountId = accountId;
     this.balance = balance;
 }

 @Override
 public int hashCode() {
     return Objects.hash(accountId);
 }

 @Override
 public boolean equals(Object obj) {
     if (!(obj instanceof Account)) return false;
     Account a = (Account) obj;
     return this.accountId == a.accountId;
 }

 @Override
 public String toString() {
     return "Account#" + accountId + " | Balance: " + balance;
 }
}

class Transaction {
 int accountId;
 double amount;
 String type; 

 public Transaction(int accountId, double amount, String type) {
     this.accountId = accountId;
     this.amount = amount;
     this.type = type;
 }

 @Override
 public String toString() {
     return "Transaction: " + type + " " + amount + " | AID=" + accountId;
 }
}

public class BankingSystem {

 public static void main(String[] args) {

     Set<Account> accounts = new HashSet<>();
     accounts.add(new Account(101, 5000));
     accounts.add(new Account(102, 8000));
     accounts.add(new Account(103, 12000));

     Queue<Transaction> pendingTransactions = new LinkedList<>();

     List<Transaction> allTransactions = new ArrayList<>();

     Stack<Transaction> rollbackStack = new Stack<>();

     addTransaction(pendingTransactions, 101, 1000, "DEPOSIT");
     addTransaction(pendingTransactions, 102, 2000, "WITHDRAW");
     addTransaction(pendingTransactions, 103, 500, "DEPOSIT");
     addTransaction(pendingTransactions, 105, 3000, "DEPOSIT"); // invalid

     System.out.println("\nProcessing Transactions...\n");

     while (!pendingTransactions.isEmpty()) {
         Transaction t = pendingTransactions.poll();

         Account acc = getAccount(accounts, t.accountId);
         if (acc == null) {
             System.out.println("INVALID ACCOUNT: " + t);
             continue;
         }

         boolean success = execute(acc, t);

         if (success) {
             allTransactions.add(t);
             rollbackStack.push(t);
             System.out.println("SUCCESS: " + t + " | New Balance: " + acc.balance);
         } else {
             System.out.println("FAILED: " + t);
         }
     }

     System.out.println("\nAttempting Rollback of Last Transaction...");
     if (!rollbackStack.isEmpty()) {
         Transaction last = rollbackStack.pop();
         Account acc = getAccount(accounts, last.accountId);
         rollback(acc, last);
         System.out.println("Rolled Back: " + last + " | Balance Restored: " + acc.balance);
     }

     System.out.println("\n--- FINAL ACCOUNT BALANCES ---");
     accounts.forEach(System.out::println);

     System.out.println("\n--- COMPLETED TRANSACTIONS ---");
     allTransactions.forEach(System.out::println);
 }


 public static void addTransaction(Queue<Transaction> q, int id, double amount, String type) {
     Transaction t = new Transaction(id, amount, type);
     q.add(t);
     System.out.println("Added Transaction: " + t);
 }

 public static Account getAccount(Set<Account> accounts, int id) {
     for (Account acc : accounts)
         if (acc.accountId == id)
             return acc;
     return null;
 }

 public static boolean execute(Account acc, Transaction t) {
     if (t.type.equals("DEPOSIT")) {
         acc.balance += t.amount;
         return true;
     }
     if (t.type.equals("WITHDRAW")) {
         if (acc.balance >= t.amount) {
             acc.balance -= t.amount;
             return true;
         } else {
             return false;
         }
     }
     return false;
 }

 public static void rollback(Account acc, Transaction t) {
     if (t.type.equals("DEPOSIT")) {
         acc.balance -= t.amount;
     } else if (t.type.equals("WITHDRAW")) {
         acc.balance += t.amount;
     }
 }
}

