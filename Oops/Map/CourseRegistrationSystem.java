import java.util.*;

public class CourseRegistrationSystem {
    public static void main(String[] args) {
        Map<String, Integer> courseReg = new HashMap<>();

        // 1. Add courses
        courseReg.put("CS101", 55);
        courseReg.put("CS102", 4);
        courseReg.put("MA101", 48);
        courseReg.put("PH101", 60);
        courseReg.put("EN101", 3);

        // 2. Add/Drop students
        courseReg.put("CS101", courseReg.get("CS101") + 2);  // 2 more joined
        courseReg.put("EN101", Math.max(0, courseReg.get("EN101") - 2)); // 2 dropped

        // 3. Categorize courses
        System.out.println("🎯 Courses Near Full (≥50):");
        for (var e : courseReg.entrySet()) {
            if (e.getValue() >= 50)
                System.out.println(e.getKey() + " → " + e.getValue() + " students");
        }

        System.out.println("\n📉 Under-Subscribed Courses (<5):");
        for (var e : courseReg.entrySet()) {
            if (e.getValue() < 5)
                System.out.println(e.getKey() + " → " + e.getValue() + " students");
        }
    }
}
