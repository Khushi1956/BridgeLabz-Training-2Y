import java.util.*;

public class BoxDemo {
    public static class Box<T> {
        private T value;
        public void set(T value) { this.value = value; }
        public T get() { return value; }
        @Override public String toString() { return String.valueOf(value); }
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(42);

        Box<String> strBox = new Box<>();
        strBox.set("Hello");

        Box<Double> dblBox = new Box<>();
        dblBox.set(3.14);

        System.out.println("Integer: " + intBox.get());
        System.out.println("String: " + strBox.get());
        System.out.println("Double: " + dblBox.get());
    }
}
