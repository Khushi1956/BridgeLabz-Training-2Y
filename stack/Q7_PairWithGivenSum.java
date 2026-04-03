import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Q7. Check for a Pair with Given Sum in an Array
 * 
 * Given an array and a target sum, determine if there exists a pair of elements
 * whose sum equals the target. Print all such pairs.
 * 
 * Approach:
 * - Use a HashMap to store visited elements.
 * - For each element, check if (target - element) already exists in the map.
 * - If yes, a valid pair is found.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Q7_PairWithGivenSum {

    /**
     * Returns true if any pair sums to target. Also prints all such pairs.
     */
    public static boolean hasPairWithSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // value -> index
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                System.out.println("  Pair found: (" + complement + ", " + arr[i] + ")"
                        + " at indices (" + map.get(complement) + ", " + i + ")");
                found = true;
            }

            // Store current element (only first occurrence for clean output)
            map.putIfAbsent(arr[i], i);
        }

        return found;
    }

    public static void main(String[] args) {
        int[] arr1 = {8, 7, 2, 5, 3, 1};
        int target1 = 10;
        System.out.println("Array: " + Arrays.toString(arr1) + ", Target: " + target1);
        boolean result1 = hasPairWithSum(arr1, target1);
        System.out.println("Pair exists: " + result1);
        // Expected pairs: (8,2), (7,3)

        System.out.println();

        int[] arr2 = {1, 2, 3, 9};
        int target2 = 8;
        System.out.println("Array: " + Arrays.toString(arr2) + ", Target: " + target2);
        boolean result2 = hasPairWithSum(arr2, target2);
        System.out.println("Pair exists: " + result2);
        // Expected: false

        System.out.println();

        int[] arr3 = {4, -3, 3, 90};
        int target3 = 0;
        System.out.println("Array: " + Arrays.toString(arr3) + ", Target: " + target3);
        boolean result3 = hasPairWithSum(arr3, target3);
        System.out.println("Pair exists: " + result3);
        // Expected pair: (-3, 3)
    }
}
