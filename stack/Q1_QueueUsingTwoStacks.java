import java.util.Stack;

/**
 * Q1. Implement a Queue Using Two Stacks
 * 
 * Design a queue using two stacks such that enqueue and dequeue operations
 * are performed efficiently.
 * 
 * Approach:
 * - stack1: used for enqueue (push)
 * - stack2: used for dequeue (pop/peek)
 * - When stack2 is empty and dequeue is called, transfer all from stack1 to stack2
 * 
 * Time Complexity: Enqueue O(1), Dequeue amortized O(1)
 * Space Complexity: O(n)
 */
public class Q1_QueueUsingTwoStacks {

    static class MyQueue {
        private Stack<Integer> stack1; // for enqueue
        private Stack<Integer> stack2; // for dequeue

        public MyQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        // Push element to the back of the queue
        public void enqueue(int val) {
            stack1.push(val);
        }

        // Remove and return the front element
        public int dequeue() {
            if (isEmpty()) throw new RuntimeException("Queue is empty!");
            transferIfNeeded();
            return stack2.pop();
        }

        // Peek at the front element without removing
        public int peek() {
            if (isEmpty()) throw new RuntimeException("Queue is empty!");
            transferIfNeeded();
            return stack2.peek();
        }

        public boolean isEmpty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }

        // Move elements from stack1 to stack2 only when stack2 is empty
        private void transferIfNeeded() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front element (peek): " + queue.peek());   // 1
        System.out.println("Dequeue: " + queue.dequeue());              // 1
        System.out.println("Dequeue: " + queue.dequeue());              // 2

        queue.enqueue(4);
        System.out.println("Dequeue: " + queue.dequeue());              // 3
        System.out.println("Dequeue: " + queue.dequeue());              // 4
        System.out.println("Is Empty: " + queue.isEmpty());             // true
    }
}
