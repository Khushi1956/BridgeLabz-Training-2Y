import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Q6. Find All Subarrays with Zero Sum
 * 
 * Given an array, find all subarrays whose elements sum to zero.
 * 
 * Approach:
 * - Use a HashMap to store cumulative sums and their occurrence indices.
 * - If a cumulative sum repeats at index j (previously seen at index i),
 *   then subarray (i+1, j) has a sum of zero.
 * - Also, if cumulative sum itself is 0 at index j, subarray (0, j) sums to zero.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Q6_SubarraysWithZeroSum {

    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        // Map: cumulative sum -> list of indices where this sum occurred
        Map<Integer, List<Integer>> map = new HashMap<>();

        // Initialize: sum 0 occurred at index -1 (before the array)
        map.computeIfAbsent(0, k -> new ArrayList<>()).add(-1);

        int cumSum = 0;

        for (int j = 0; j < arr.length; j++) {
            cumSum += arr[j];

            if (map.containsKey(cumSum)) {
                // Every previous occurrence gives a zero-sum subarray ending at j
                for (int i : map.get(cumSum)) {
                    result.add(new int[]{i + 1, j});
                }
            }

            map.computeIfAbsent(cumSum, k -> new ArrayList<>()).add(j);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        System.out.println("Array: ");
        printArray(arr1);
        List<int[]> subarrays1 = findZeroSumSubarrays(arr1);
        System.out.println("Zero Sum Subarrays (start, end indices):");
        for (int[] sub : subarrays1) {
            System.out.println("  [" + sub[0] + ", " + sub[1] + "]");
        }

        System.out.println();

        int[] arr2 = {1, 2, -3, 3, -3};
        System.out.println("Array: ");
        printArray(arr2);
        List<int[]> subarrays2 = findZeroSumSubarrays(arr2);
        System.out.println("Zero Sum Subarrays (start, end indices):");
        for (int[] sub : subarrays2) {
            System.out.println("  [" + sub[0] + ", " + sub[1] + "]");
        }
    }

    private static void printArray(int[] arr) {
        System.out.print("  [ ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println("]");
    }
}
