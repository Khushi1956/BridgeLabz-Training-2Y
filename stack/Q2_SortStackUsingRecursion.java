import java.util.Stack;

/**
 * Q2. Sort a Stack Using Recursion
 * 
 * Given a stack, sort its elements in ascending order (smallest on top) using recursion.
 * 
 * Approach:
 * - Pop the top element, recursively sort the remaining stack,
 *   then insert the popped element at its correct sorted position.
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(n) - recursive call stack
 */
public class Q2_SortStackUsingRecursion {

    // Main sort function: pop all and re-insert in sorted order
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            sortStack(stack);          // Sort the remaining stack
            insertSorted(stack, top);  // Insert popped element at correct position
        }
    }

    // Insert element in a sorted stack (ascending, smallest on top)
    private static void insertSorted(Stack<Integer> stack, int element) {
        // Base case: stack is empty, or element is smaller than top
        if (stack.isEmpty() || element <= stack.peek()) {
            stack.push(element);
        } else {
            int top = stack.pop();
            insertSorted(stack, element); // Go deeper to find correct spot
            stack.push(top);             // Restore the top
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        System.out.println("Before Sorting: " + stack);
        sortStack(stack);
        System.out.println("After Sorting (top = smallest): " + stack);

        // Test with another example
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(5);
        stack2.push(1);
        stack2.push(4);
        stack2.push(2);
        stack2.push(3);

        System.out.println("\nBefore Sorting: " + stack2);
        sortStack(stack2);
        System.out.println("After Sorting (top = smallest): " + stack2);
    }
}
