import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> grades = new TreeMap<>(); // TreeMap → sorted by key

        // 1. Add students
        grades.put("Khushi", 85.0);
        grades.put("Rohan", 78.5);
        grades.put("Aditi", 92.0);
        grades.put("Manav", 88.5);

        // 2. Update grade
        grades.put("Rohan", 84.0); // Rohan retook test

        // 3. Remove a student
        grades.remove("Manav");

        // 4. Print sorted list
        System.out.println("📘 Student Grades:");
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
