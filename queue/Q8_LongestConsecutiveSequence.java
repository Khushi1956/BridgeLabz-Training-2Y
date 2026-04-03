import java.util.*;

public class Q8_LongestConsecutiveSequence {

    static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        int max = 0;

        for (int n : set) {
            if (!set.contains(n - 1)) {
                int len = 1;
                while (set.contains(n + len)) len++;
                max = Math.max(max, len);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Longest consecutive: " + longestConsecutive(arr));
    }
}
