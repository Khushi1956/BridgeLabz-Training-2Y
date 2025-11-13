import java.util.*;

public class PatientIDs {
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(101, 102, 103, 104);
        // Using method reference
        ids.forEach(System.out::println);
    }
}
