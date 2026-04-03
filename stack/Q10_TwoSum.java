import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Q10. Two Sum Problem
 * 
 * Given an array and a target sum, find the indices of two numbers
 * such that they add up to the target. Assume exactly one solution exists.
 * 
 * Approach:
 * - Use a HashMap to store each element's value -> index as we iterate.
 * - For each element, check if (target - element) already exists in the map.
 * - If yes, we found the pair — return both indices immediately.
 * - This avoids the O(n^2) brute force approach.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Q10_TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        // Map: value -> index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{}; // no solution (per problem guarantee, won't reach here)
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Array: " + Arrays.toString(nums1) + ", Target: " + target1);
        System.out.println("Indices: " + Arrays.toString(twoSum(nums1, target1)));
        // Expected: [0, 1]  (nums[0] + nums[1] = 2 + 7 = 9)

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println("\nArray: " + Arrays.toString(nums2) + ", Target: " + target2);
        System.out.println("Indices: " + Arrays.toString(twoSum(nums2, target2)));
        // Expected: [1, 2]  (nums[1] + nums[2] = 2 + 4 = 6)

        int[] nums3 = {3, 3};
        int target3 = 6;
        System.out.println("\nArray: " + Arrays.toString(nums3) + ", Target: " + target3);
        System.out.println("Indices: " + Arrays.toString(twoSum(nums3, target3)));
        // Expected: [0, 1]

        int[] nums4 = {1, 4, 7, 9, 2, 13};
        int target4 = 11;
        System.out.println("\nArray: " + Arrays.toString(nums4) + ", Target: " + target4);
        System.out.println("Indices: " + Arrays.toString(twoSum(nums4, target4)));
        // Expected: [1, 3]  (4 + 7 = 11 is at indices 1 and 2, but 2+9=11 at 4 and 3)
    }
}
