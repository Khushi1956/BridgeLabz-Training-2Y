import java.util.*;

public class WarehouseDemo {
    static abstract class WarehouseItem {
        private final String name;
        WarehouseItem(String name){ this.name = name; }
        public String getName(){ return name; }
        @Override public String toString(){ return getClass().getSimpleName() + "(" + name + ")"; }
    }
    static class Electronics extends WarehouseItem { Electronics(String n){super(n);} }
    static class Grocery extends WarehouseItem { Grocery(String n){super(n);} }
    static class Furniture extends WarehouseItem { Furniture(String n){super(n);} }

    public static class Storage<T extends WarehouseItem> {
        private final List<T> items = new ArrayList<>();
        public void add(T item) { items.add(item); }
        public List<T> getAll() { return Collections.unmodifiableList(items); }
    }

    public static void showAllStorages(List<? extends WarehouseItem> list) {
        System.out.println("Showing items:");
        for (WarehouseItem it : list) System.out.println(" - " + it);
    }

    public static void main(String[] args) {
        Storage<Electronics> eStore = new Storage<>();
        eStore.add(new Electronics("TV"));
        eStore.add(new Electronics("Phone"));

        Storage<Grocery> gStore = new Storage<>();
        gStore.add(new Grocery("Rice"));
        gStore.add(new Grocery("Oil"));

        // Display (use wildcard to accept any WarehouseItem list)
        showAllStorages(eStore.getAll());
        showAllStorages(gStore.getAll());
    }
}
