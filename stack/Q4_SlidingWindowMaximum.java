import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * Q4. Sliding Window Maximum
 * 
 * Given an array and a window size k, find the maximum element
 * in each sliding window of size k.
 * 
 * Approach:
 * - Use a Deque (double-ended queue) to store indices of useful elements.
 * - The deque stores indices in decreasing order of their values.
 * - For each new element:
 *   1. Remove indices that are out of the current window from the front.
 *   2. Remove indices from the back whose values are <= current element.
 *   3. Add the current index to the back.
 *   4. The front of the deque is always the index of the max element.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(k)
 */
public class Q4_SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>(); // stores indices

        for (int i = 0; i < n; i++) {
            // Remove elements outside the current window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove elements smaller than current from the back (they're useless)
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            // Start recording results once the first full window is formed
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, -1, -3, 5, 3, 6, 7};
        int k1 = 3;
        System.out.println("Array: " + Arrays.toString(nums1) + ", k = " + k1);
        System.out.println("Sliding Window Maximums: " + Arrays.toString(maxSlidingWindow(nums1, k1)));
        // Expected: [3, 3, 5, 5, 6, 7]

        int[] nums2 = {2, 1, 5, 3, 6, 4, 8, 9, 2};
        int k2 = 4;
        System.out.println("\nArray: " + Arrays.toString(nums2) + ", k = " + k2);
        System.out.println("Sliding Window Maximums: " + Arrays.toString(maxSlidingWindow(nums2, k2)));
        // Expected: [5, 6, 6, 8, 9, 9]
    }
}
