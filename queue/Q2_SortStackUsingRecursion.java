import java.util.Stack;

public class Q2_SortStackUsingRecursion {

    static void insertSorted(Stack<Integer> s, int val) {
        if (s.isEmpty() || val <= s.peek()) { s.push(val); return; }
        int top = s.pop();
        insertSorted(s, val);
        s.push(top);
    }

    static void sortStack(Stack<Integer> s) {
        if (s.isEmpty()) return;
        int top = s.pop();
        sortStack(s);
        insertSorted(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(34); s.push(3); s.push(31); s.push(98); s.push(92);
        System.out.println("Before: " + s);
        sortStack(s);
        System.out.println("After:  " + s);
    }
}
