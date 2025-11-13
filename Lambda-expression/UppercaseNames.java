import java.util.*;
import java.util.stream.Collectors;

public class UppercaseNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Khushi", "Aarav", "Meera");
        List<String> upper = names.stream()
                                  .map(String::toUpperCase)
                                  .collect(Collectors.toList());
        upper.forEach(System.out::println);
    }
}
