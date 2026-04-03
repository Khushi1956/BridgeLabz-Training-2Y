import java.util.*;

public class Q10_TwoSum {

    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) return new int[]{map.get(comp), i};
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println("Array: " + Arrays.toString(nums) + ", Target: 9");
        System.out.println("Indices: " + Arrays.toString(twoSum(nums, 9)));

        int[] nums2 = {3, 2, 4};
        System.out.println("Array: " + Arrays.toString(nums2) + ", Target: 6");
        System.out.println("Indices: " + Arrays.toString(twoSum(nums2, 6)));
    }
}
