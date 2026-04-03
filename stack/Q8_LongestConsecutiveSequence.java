import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Q8. Longest Consecutive Sequence
 * 
 * Given an unsorted array, find the length of the longest sequence of
 * consecutive integers.
 * 
 * Approach:
 * - Add all elements to a HashSet for O(1) lookups.
 * - For each element, check if it is the START of a sequence (i.e., element-1 is not in set).
 * - If it is a start, keep counting forward (element+1, element+2, ...) while present in the set.
 * - Track the maximum length seen.
 * 
 * Time Complexity: O(n) - each element is visited at most twice
 * Space Complexity: O(n)
 */
public class Q8_LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) numSet.add(num);

        int maxLength = 0;

        for (int num : numSet) {
            // Only start counting from the beginning of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr1 = {100, 4, 200, 1, 3, 2};
        System.out.println("Array: " + Arrays.toString(arr1));
        System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(arr1));
        // Expected: 4  (sequence: 1, 2, 3, 4)

        int[] arr2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println("\nArray: " + Arrays.toString(arr2));
        System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(arr2));
        // Expected: 9  (sequence: 0,1,2,3,4,5,6,7,8)

        int[] arr3 = {9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6};
        System.out.println("\nArray: " + Arrays.toString(arr3));
        System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(arr3));
        // Expected: 7  (sequence: -1,0,1... 3,4,5,6,7,8,9 -> length 7: 3..9)
    }
}
