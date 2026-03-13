import java.util.*;

public class LibraryBookCatalog {
    public static void main(String[] args) {
        Map<String, String> catalog = new TreeMap<>(); // Sorted by ISBN

        // 1. Add books
        catalog.put("978-1111111111", "Java Programming");
        catalog.put("978-2222222222", "Data Structures");
        catalog.put("978-3333333333", "Database Systems");
        catalog.put("978-4444444444", "Operating Systems");

        // 2. Search by ISBN
        String searchISBN = "978-2222222222";
        if (catalog.containsKey(searchISBN)) {
            System.out.println("Book Found: " + catalog.get(searchISBN));
        } else {
            System.out.println("Book not found");
        }

        // 3. Remove a book
        catalog.remove("978-4444444444");

        // 4. Print all ISBN + titles sorted
        System.out.println("\n📘 Library Catalog:");
        for (var entry : catalog.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // 5. Search by title
        String titleSearch = "Database Systems";
        boolean found = false;
        for (var entry : catalog.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(titleSearch)) {
                System.out.println("\nFound title '" + titleSearch + "' with ISBN: " + entry.getKey());
                found = true;
            }
        }
        if (!found) System.out.println("\nBook not found by title");
    }
}
