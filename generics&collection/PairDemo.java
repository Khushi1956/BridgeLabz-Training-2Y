public class PairDemo {
    public static class Pair<T, U> {
        private final T first;
        private final U second;
        public Pair(T first, U second) { this.first = first; this.second = second; }
        public T getFirst() { return first; }
        public U getSecond() { return second; }
        @Override public String toString() { return "(" + first + ", " + second + ")"; }
    }

    public static void main(String[] args) {
        Pair<String, Integer> student = new Pair<>("Amol", 20);
        Pair<Double, String> sample = new Pair<>(3.14, "pi");
        System.out.println("Student Pair: " + student);
        System.out.println("Sample Pair: " + sample);
    }
}
