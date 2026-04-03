import java.util.Arrays;
import java.util.Stack;

/**
 * Q3. Stock Span Problem
 * 
 * For each day in a stock price array, calculate the span — the number of
 * consecutive days (including today) for which the price was less than or
 * equal to today's price.
 * 
 * Approach:
 * - Use a stack to store indices of prices in decreasing order.
 * - For each day, pop indices from the stack while the price at those indices
 *   is <= current price.
 * - The span is (current index - index of the last greater price).
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Q3_StockSpanProblem {

    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>(); // stores indices

        for (int i = 0; i < n; i++) {
            // Pop elements while stack top price is <= current price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If stack is empty, all previous prices were <= current price
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int[] prices1 = {100, 80, 60, 70, 60, 75, 85};
        System.out.println("Prices: " + Arrays.toString(prices1));
        System.out.println("Spans:  " + Arrays.toString(calculateSpan(prices1)));
        // Expected: [1, 1, 1, 2, 1, 4, 6]

        int[] prices2 = {10, 4, 5, 90, 120, 80};
        System.out.println("\nPrices: " + Arrays.toString(prices2));
        System.out.println("Spans:  " + Arrays.toString(calculateSpan(prices2)));
        // Expected: [1, 1, 2, 4, 5, 1]
    }
}
