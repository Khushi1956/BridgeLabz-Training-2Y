import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name; this.price = price; this.rating = rating; this.discount = discount;
    }

    public String toString() {
        return name + " | ₹" + price + " | Rating: " + rating + " | Discount: " + discount + "%";
    }
}

public class ECommerceSort {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Shoes", 2500, 4.5, 10),
            new Product("Watch", 3000, 4.2, 15),
            new Product("Bag", 1500, 4.8, 5)
        );

        // Sort by Price
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("Sorted by Price:");
        products.forEach(System.out::println);

        // Sort by Rating
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("\nSorted by Rating:");
        products.forEach(System.out::println);
    }
}
