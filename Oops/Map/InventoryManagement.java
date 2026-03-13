import java.util.*;

public class InventoryManagement {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();

        // 1. Add products
        inventory.put("Apples", 30);
        inventory.put("Bananas", 20);
        inventory.put("Oranges", 10);

        // 2. Customer buys
        inventory.put("Apples", inventory.get("Apples") - 5);
        inventory.put("Bananas", inventory.get("Bananas") - 20);

        // Remove if out of stock
        inventory.entrySet().removeIf(e -> e.getValue() <= 0);

        // 3. New shipment
        inventory.put("Oranges", inventory.get("Oranges") + 15);

        // 4. Query product
        String query = "Apples";
        if (inventory.containsKey(query)) {
            System.out.println(query + " remaining: " + inventory.get(query));
        } else {
            System.out.println(query + " not stocked");
        }

        // Print out-of-stock items
        System.out.println("\n🧾 Current Inventory:");
        for (var e : inventory.entrySet()) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }
    }
}
