import java.util.*;

public class PriceCalculatorDemo {
    static abstract class Product {
        private final double price;
        Product(double price){ this.price = price; }
        public double getPrice(){ return price; }
        @Override public String toString(){ return getClass().getSimpleName() + "@" + price; }
    }
    static class Mobile extends Product { Mobile(double p){super(p);} }
    static class Laptop extends Product { Laptop(double p){super(p);} }

    public static double calculateTotal(List<? extends Product> items) {
        return items.stream().mapToDouble(Product::getPrice).sum();
    }

    public static void main(String[] args) {
        List<Mobile> mobiles = Arrays.asList(new Mobile(15000), new Mobile(12000));
        List<Laptop> laptops = Arrays.asList(new Laptop(45000), new Laptop(55000));

        System.out.println("Mobile total: ₹" + calculateTotal(mobiles));
        System.out.println("Laptop total: ₹" + calculateTotal(laptops));
    }
}
