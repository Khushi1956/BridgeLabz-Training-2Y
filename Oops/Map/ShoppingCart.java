import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        Map<String, Double> cart = new LinkedHashMap<>(); // preserves insertion order

        // 1. Add products
        cart.put("Laptop", 45000.0);
        cart.put("Mouse", 800.0);
        cart.put("Keyboard", 1200.0);
        cart.put("Headphones", 2500.0);
        cart.put("Monitor", 6000.0);

        // 2. Display products in order
        System.out.println("🛍️ Products in Cart:");
        cart.forEach((k, v) -> System.out.println(k + " → ₹" + v));

        // 3. Calculate total
        double total = cart.values().stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("\n💰 Total Bill: ₹" + total);

        // 4. Apply discount
        if (total > 5000) {
            double discount = total * 0.10;
            total -= discount;
            System.out.println("🎉 10% Discount Applied! New Total: ₹" + total);
        }

        // 5. Remove an item (simulate user removing)
        cart.remove("Mouse");
        System.out.println("\n🧾 Updated Cart After Removal:");
        cart.forEach((k, v) -> System.out.println(k + " → ₹" + v));
    }
}
