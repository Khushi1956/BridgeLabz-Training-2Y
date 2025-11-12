public class MaximumDemo {
    // Works for Comparable types (Integer, Double, String, etc.)
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) max = y;
        if (z.compareTo(max) > 0) max = z;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximum(3, 7, 5));                // 7
        System.out.println(maximum(3.2, 1.5, 4.8));          // 4.8
        System.out.println(maximum("apple", "banana", "az"));// banana
    }
}
