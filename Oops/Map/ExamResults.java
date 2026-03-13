import java.util.*;

public class ExamResults {
    public static void main(String[] args) {
        // subject → (student → marks)
        Map<String, Map<String, Integer>> results = new HashMap<>();

        // 1. Add subjects and student marks
        results.put("Math", Map.of("Aditi", 95, "Rohan", 88, "Khushi", 76));
        results.put("Science", Map.of("Aditi", 90, "Rohan", 92, "Khushi", 85));
        results.put("English", Map.of("Aditi", 80, "Rohan", 70, "Khushi", 89));

        // 2. Find top scorer per subject
        System.out.println("🏆 Topper per Subject:");
        for (var subjectEntry : results.entrySet()) {
            String subject = subjectEntry.getKey();
            Map<String, Integer> marksMap = subjectEntry.getValue();

            String topper = Collections.max(marksMap.entrySet(), Map.Entry.comparingByValue()).getKey();
            int topMarks = marksMap.get(topper);
            System.out.println(subject + " → " + topper + " (" + topMarks + ")");
        }

        // 3. Average score per subject
        System.out.println("\n📊 Average Score per Subject:");
        for (var subjectEntry : results.entrySet()) {
            double avg = subjectEntry.getValue().values().stream().mapToInt(Integer::intValue).average().orElse(0);
            System.out.printf("%s → %.2f\n", subjectEntry.getKey(), avg);
        }

        // 4. Subjects with score above 90
        System.out.println("\n🎯 Subjects with at least one score > 90:");
        for (var subjectEntry : results.entrySet()) {
            boolean has90 = subjectEntry.getValue().values().stream().anyMatch(v -> v > 90);
            if (has90)
                System.out.println(subjectEntry.getKey());
        }
    }
}
