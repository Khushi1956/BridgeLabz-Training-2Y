import java.util.*;

public class ShoppingCartPriceCalculation2 {
    public static void main(String[] args) {
        String[] prices = {"100", "250", "xyz", "400"};
        int total = 0;

        for (String price : prices) {
            try {
                total += Integer.parseInt(price);
            } catch (NumberFormatException e) {
                System.out.println("Invalid price: " + price);
            }
        }

        System.out.println("Total Cart Value = " + total);
    }
}
