import java.util.*;

public class WebsiteVisitTracker {
    public static void main(String[] args) {
        Map<String, Integer> visits = new HashMap<>();

        // Simulate page visits
        String[] pages = {"home", "about", "products", "home", "products", "contact", "home", "about", "home"};

        for (String page : pages) {
            visits.put(page, visits.getOrDefault(page, 0) + 1);
        }

        // Sort by descending visit count
        List<Map.Entry<String, Integer>> list = new ArrayList<>(visits.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        // Print results
        System.out.println("📊 Page Visit Report (Descending Order):");
        for (var e : list) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }

        // Most visited page
        String topPage = list.get(0).getKey();
        System.out.println("\n🏆 Most Visited Page: " + topPage);
    }
}
