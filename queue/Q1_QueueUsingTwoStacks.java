import java.util.Stack;

public class Q1_QueueUsingTwoStacks {

    static class MyQueue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        void enqueue(int val) {
            s1.push(val);
        }

        int dequeue() {
            if (s2.isEmpty())
                while (!s1.isEmpty()) s2.push(s1.pop());
            return s2.pop();
        }

        int peek() {
            if (s2.isEmpty())
                while (!s1.isEmpty()) s2.push(s1.pop());
            return s2.peek();
        }

        boolean isEmpty() { return s1.isEmpty() && s2.isEmpty(); }
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enqueue(1); q.enqueue(2); q.enqueue(3);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue(4);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
