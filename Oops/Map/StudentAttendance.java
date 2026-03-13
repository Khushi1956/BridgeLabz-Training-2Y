import java.util.*;

public class StudentAttendance {
    public static void main(String[] args) {
        Map<String, Integer> attendance = new HashMap<>();

        // 1. Initialize students
        String[] students = {"Aditi", "Rohan", "Khushi", "Manav", "Priya"};
        for (String s : students) attendance.put(s, 0);

        Random rand = new Random();

        // 2. Simulate 15 days
        for (int day = 1; day <= 15; day++) {
            System.out.println("Day " + day + " attendance:");
            for (String s : students) {
                boolean present = rand.nextBoolean();
                if (present) attendance.put(s, attendance.get(s) + 1);
                System.out.println(" - " + s + ": " + (present ? "Present" : "Absent"));
            }
            System.out.println();
        }

        // 3. Print under-attending (<10 days)
        System.out.println("🚸 Students with attendance < 10 days:");
        for (var entry : attendance.entrySet()) {
            if (entry.getValue() < 10)
                System.out.println(entry.getKey() + " → " + entry.getValue() + " days");
        }
    }
}
