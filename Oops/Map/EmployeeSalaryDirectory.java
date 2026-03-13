import java.util.*;

public class EmployeeSalaryDirectory {
    public static void main(String[] args) {
        Map<String, Double> salaries = new HashMap<>();

        // 1. Add employees
        salaries.put("Khushi", 55000.0);
        salaries.put("Rohan", 72000.0);
        salaries.put("Aditi", 68000.0);
        salaries.put("Manav", 49000.0);
        salaries.put("Priya", 73000.0);
        salaries.put("Dev", 80000.0);

        // 2. Give raises
        giveRaise(salaries, "Khushi", 10);
        giveRaise(salaries, "Aditi", 5);
        giveRaise(salaries, "Ravi", 7); // Not found case

        // 3. Compute average salary
        double avg = salaries.values().stream().mapToDouble(Double::doubleValue).average().orElse(0);
        System.out.printf("\n💰 Average Salary: ₹%.2f\n", avg);

        // 4. Find highest-paid employee(s)
        double maxSalary = Collections.max(salaries.values());
        System.out.println("🏆 Highest Paid Employee(s):");
        for (var e : salaries.entrySet()) {
            if (e.getValue() == maxSalary)
                System.out.println(e.getKey() + " → ₹" + e.getValue());
        }
    }

    // Helper method to increase salary
    private static void giveRaise(Map<String, Double> map, String name, double percent) {
        if (map.containsKey(name)) {
            double newSalary = map.get(name) * (1 + percent / 100);
            map.put(name, newSalary);
            System.out.println("✅ " + name + " got a " + percent + "% raise → ₹" + newSalary);
        } else {
            System.out.println("❌ Employee not found: " + name);
        }
    }
}
