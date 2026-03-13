import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        Map<String, Double> accounts = new HashMap<>();

        // 1. Add new customers
        accounts.put("AC001", 50000.0);
        accounts.put("AC002", 35000.0);
        accounts.put("AC003", 80000.0);
        accounts.put("AC004", 15000.0);
        accounts.put("AC005", 62000.0);

        // 2. Deposit and Withdraw
        deposit(accounts, "AC002", 5000);
        withdraw(accounts, "AC004", 20000); // should fail
        withdraw(accounts, "AC001", 10000);

        // 3. Print sorted by descending balance
        System.out.println("\n🏦 Accounts Sorted by Balance:");
        accounts.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .forEach(e -> System.out.println(e.getKey() + " → ₹" + e.getValue()));

        // 4. Top 3 customers
        System.out.println("\n💎 Top 3 Customers:");
        accounts.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(3)
                .forEach(e -> System.out.println(e.getKey() + " → ₹" + e.getValue()));
    }

    static void deposit(Map<String, Double> map, String acc, double amt) {
        map.put(acc, map.getOrDefault(acc, 0.0) + amt);
        System.out.println("✅ Deposited ₹" + amt + " to " + acc);
    }

    static void withdraw(Map<String, Double> map, String acc, double amt) {
        if (!map.containsKey(acc)) {
            System.out.println("❌ Account not found: " + acc);
            return;
        }
        double balance = map.get(acc);
        if (balance < amt) {
            System.out.println("⚠️ Insufficient balance for " + acc);
        } else {
            map.put(acc, balance - amt);
            System.out.println("💸 Withdrawn ₹" + amt + " from " + acc);
        }
    }
}
