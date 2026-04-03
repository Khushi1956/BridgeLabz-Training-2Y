import java.util.*;

public class Q6_SubarraysWithZeroSum {

    static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(0, new ArrayList<>(Arrays.asList(-1)));
        int sum = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum))
                for (int i : map.get(sum)) result.add(new int[]{i + 1, j});
            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(j);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        System.out.println("Zero sum subarrays:");
        for (int[] s : findZeroSumSubarrays(arr))
            System.out.println("  [" + s[0] + ", " + s[1] + "]");
    }
}
