import java.util.*;

public class MarketplaceDemo {
    // Category marker interfaces (could be enums or classes)
    interface BookCategory {}
    interface ClothingCategory {}
    interface GadgetCategory {}

    // Generic Product class bound to a category type (marker interface)
    public static class Product<T> {
        private final String name;
        private double price;
        private final T categoryMarker;
        public Product(String name, double price, T marker) {
            this.name = name; this.price = price; this.categoryMarker = marker;
        }
        public double getPrice() { return price; }
        public void setPrice(double p) { this.price = p; }
        public String getName() { return name; }
        @Override public String toString(){ return name + " ₹" + price; }
    }

    // Generic discount applier
    public static <P extends Product<?>> void applyDiscount(P product, double percentage) {
        double newPrice = product.getPrice() * (1 - percentage / 100);
        product.setPrice(newPrice);
    }

    public static void main(String[] args) {
        // Create products with dummy markers
        Product<BookCategory> book = new Product<>("Java Book", 500, null);
        Product<ClothingCategory> tshirt = new Product<>("T-Shirt", 800, null);
        Product<GadgetCategory> phone = new Product<>("Phone", 15000, null);

        System.out.println("Before discount: " + book + ", " + tshirt + ", " + phone);
        applyDiscount(book, 10);    // 10% off
        applyDiscount(phone, 5);    // 5% off
        System.out.println("After discount: " + book + ", " + tshirt + ", " + phone);
    }
}
