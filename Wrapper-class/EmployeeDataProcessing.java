import java.util.*;

public class EmployeeDataProcessing {
    public static void main(String[] args) {
        int[] ages = {25, 32, 41, 29, 56, 22};

        ArrayList<Integer> ageList = new ArrayList<>();
        for (int age : ages) {
            ageList.add(age); // Auto-boxing
        }

        System.out.println("Employee Ages: " + ageList);
        System.out.println("Youngest Employee: " + Collections.min(ageList));
        System.out.println("Oldest Employee: " + Collections.max(ageList));
    }
}
