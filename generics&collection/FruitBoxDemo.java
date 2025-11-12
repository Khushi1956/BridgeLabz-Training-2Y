import java.util.*;

public class FruitBoxDemo {
    static class Fruit {
        private final String name;
        Fruit(String name){ this.name = name; }
        @Override public String toString(){ return name; }
    }
    static class Apple extends Fruit { Apple(){ super("Apple"); } }
    static class Mango extends Fruit { Mango(){ super("Mango"); } }
    static class Car { } // non-fruit for demonstration

    public static class FruitBox<T extends Fruit> {
        private final List<T> items = new ArrayList<>();
        public void add(T fruit) { items.add(fruit); }
        public void show() {
            System.out.println("FruitBox contains:");
            for (T f : items) System.out.println(" - " + f);
        }
    }

    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.show();

        FruitBox<Mango> mangoBox = new FruitBox<>();
        mangoBox.add(new Mango());
        mangoBox.show();

        // The following line would NOT compile (uncomment to see error):
        // FruitBox<Car> carBox = new FruitBox<>(); // Car is not a Fruit
    }
}
