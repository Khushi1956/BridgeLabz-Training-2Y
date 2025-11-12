import java.util.*;

public class PerformanceImpactWrapper {
    public static void main(String[] args) {
        int n = 1_000_000;

        // 1️⃣ Primitive array
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) intArray[i] = i;

        long start1 = System.currentTimeMillis();
        long sum1 = 0;
        for (int val : intArray) sum1 += val;
        long end1 = System.currentTimeMillis();

        System.out.println("Primitive int[] sum = " + sum1 + " | Time: " + (end1 - start1) + " ms");

        // 2️⃣ Wrapper ArrayList
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) list.add(i); // auto-boxing

        long start2 = System.currentTimeMillis();
        long sum2 = 0;
        for (Integer val : list) sum2 += val; // auto-unboxing
        long end2 = System.currentTimeMillis();

        System.out.println("ArrayList<Integer> sum = " + sum2 + " | Time: " + (end2 - start2) + " ms");
    }
}
