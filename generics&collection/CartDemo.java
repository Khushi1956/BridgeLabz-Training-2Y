import java.util.*;

public class CartDemo {
    public static class Cart<T> {
        private final List<T> items = new ArrayList<>();
        public void addItem(T item) { items.add(item); }
        public void removeItem(T item) { items.remove(item); }
        public void displayItems() {
            System.out.println("Cart items:");
            for (T i : items) System.out.println(" - " + i);
        }
    }

    static class Electronics { String name; Electronics(String n){name=n;} public String toString(){return name;} }
    static class Clothing { String name; Clothing(String n){name=n;} public String toString(){return name;} }

    public static void main(String[] args) {
        Cart<Electronics> eCart = new Cart<>();
        eCart.addItem(new Electronics("Mobile"));
        eCart.addItem(new Electronics("Headset"));

        Cart<Clothing> cCart = new Cart<>();
        cCart.addItem(new Clothing("T-Shirt"));
        cCart.addItem(new Clothing("Jeans"));

        System.out.println("Electronics cart:");
        eCart.displayItems();
        System.out.println("Clothing cart:");
        cCart.displayItems();
    }
}
