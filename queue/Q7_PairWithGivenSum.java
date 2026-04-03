import java.util.*;

public class Q7_PairWithGivenSum {

    static boolean hasPair(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            int comp = target - arr[i];
            if (map.containsKey(comp)) {
                System.out.println("Pair: (" + comp + ", " + arr[i] + ")");
                found = true;
            }
            map.putIfAbsent(arr[i], i);
        }
        return found;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        System.out.println("Array: " + Arrays.toString(arr) + ", Target: 10");
        System.out.println("Found: " + hasPair(arr, 10));
    }
}
