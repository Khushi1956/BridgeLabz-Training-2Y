import java.util.*;

public class CountryCapitalLookup {
    public static void main(String[] args) {
        Map<String, String> countryCapital = new TreeMap<>(); // Sorted alphabetically

        // 1. Add countries and capitals
        countryCapital.put("India", "New Delhi");
        countryCapital.put("USA", "Washington D.C.");
        countryCapital.put("France", "Paris");
        countryCapital.put("Japan", "Tokyo");
        countryCapital.put("Germany", "Berlin");
        countryCapital.put("Canada", "Ottawa");
        countryCapital.put("Australia", "Canberra");
        countryCapital.put("Brazil", "Brasilia");

        // 2. Lookup by country
        String search = "Japan";
        if (countryCapital.containsKey(search)) {
            System.out.println("Capital of " + search + " → " + countryCapital.get(search));
        } else {
            System.out.println("Unknown country");
        }

        // 3. Print all countries alphabetically
        System.out.println("\n🌏 All Countries & Capitals:");
        for (var e : countryCapital.entrySet()) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }
    }
}
