public class CompareDemo {
    public static <T> boolean isEqual(T a, T b) {
        if (a == null) return b == null;
        return a.equals(b);
    }

    public static void main(String[] args) {
        System.out.println(isEqual("a", "a"));      // true
        System.out.println(isEqual(5, 6));          // false
        System.out.println(isEqual(null, null));    // true
        System.out.println(isEqual("x", null));     // false
    }
}
