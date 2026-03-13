import java.util.*;

public class EmployeeDepartmentMapping {
    public static void main(String[] args) {
        Map<Integer, String> empDept = new HashMap<>();

        // 1. Add employees
        empDept.put(101, "HR");
        empDept.put(102, "IT");
        empDept.put(103, "Finance");
        empDept.put(104, "IT");
        empDept.put(105, "Marketing");
        empDept.put(106, "Finance");

        // 2. Change department
        empDept.put(105, "HR"); // Employee 105 moved to HR

        // 3. Find all employees in a department (reverse lookup)
        String searchDept = "IT";
        System.out.println("👥 Employees in " + searchDept + " Department:");
        for (var e : empDept.entrySet()) {
            if (e.getValue().equalsIgnoreCase(searchDept))
                System.out.println("Employee ID: " + e.getKey());
        }

        // 4. Count total employees per department
        Map<String, Integer> deptCount = new HashMap<>();
        for (String dept : empDept.values()) {
            deptCount.put(dept, deptCount.getOrDefault(dept, 0) + 1);
        }

        System.out.println("\n🏢 Total Employees per Department:");
        for (var e : deptCount.entrySet()) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }
    }
}
