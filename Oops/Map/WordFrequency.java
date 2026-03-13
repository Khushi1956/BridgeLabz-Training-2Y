import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";

        // Normalize and split
        String[] words = sentence.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");
        Map<String, Integer> freq = new LinkedHashMap<>();

        // Count words
        for (String w : words) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }

        // Print results
        System.out.println("🗂 Word Frequency:");
        for (var entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
