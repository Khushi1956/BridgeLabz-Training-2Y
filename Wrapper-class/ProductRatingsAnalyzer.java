import java.util.*;
import java.util.stream.Collectors;

public class ProductRatingsAnalyzer {
    public static void main(String[] args) {
        int[] oldRatings = {4, 5, 3};
        ArrayList<Integer> newRatings = new ArrayList<>(Arrays.asList(5, null, 4, 2));

        List<Integer> combined = new ArrayList<>();

        // Merge old primitive ratings
        for (int r : oldRatings) combined.add(r);

        // Merge new ratings (wrapper)
        for (Integer r : newRatings) {
            if (Objects.nonNull(r)) combined.add(r);
        }

        double avg = combined.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("All Ratings: " + combined);
        System.out.println("Average Rating: " + avg);
    }
}
