import java.util.*;

public class EmployeeDataProcessing2 {
    public static void main(String[] args) {
        int[] ages = {27, 45, 30, 21, 38};
        ArrayList<Integer> list = new ArrayList<>();

        for (int age : ages)
            list.add(age);

        System.out.println("Employee Ages: " + list);
        System.out.println("Min Age: " + Collections.min(list));
        System.out.println("Max Age: " + Collections.max(list));
    }
}
