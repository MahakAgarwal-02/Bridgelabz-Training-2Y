package Map;

import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {

        HashMap<String, Double> accounts = new HashMap<>();

        accounts.put("ACC101", 5000.0);
        accounts.put("ACC102", 12000.0);
        accounts.put("ACC103", 7500.0);
        accounts.put("ACC104", 3000.0);
        accounts.put("ACC105", 15000.0);

        deposit(accounts, "ACC101", 2000);
        withdraw(accounts, "ACC102", 3000);
        withdraw(accounts, "ACC104", 5000); 
        deposit(accounts, "ACC103", 2500);

        List<Map.Entry<String, Double>> list = new ArrayList<>(accounts.entrySet());
        list.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        System.out.println("\n=== Customers Sorted by Balance (High → Low) ===");
        for (Map.Entry<String, Double> e : list) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }

        System.out.println("\n=== Top 3 Customers ===");
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            Map.Entry<String, Double> e = list.get(i);
            System.out.println((i + 1) + ". " + e.getKey() + " → " + e.getValue());
        }
    }

    public static void deposit(HashMap<String, Double> map, String acc, double amount) {
        map.put(acc, map.getOrDefault(acc, 0.0) + amount);
        System.out.println(amount + " deposited to " + acc);
    }

    public static void withdraw(HashMap<String, Double> map, String acc, double amount) {
        if (!map.containsKey(acc)) {
            System.out.println("Account not found: " + acc);
            return;
        }

        double current = map.get(acc);
        if (amount > current) {
            System.out.println("❌ Withdrawal failed for " + acc + " (Insufficient balance)");
        } else {
            map.put(acc, current - amount);
            System.out.println(amount + " withdrawn from " + acc);
        }
    }
}