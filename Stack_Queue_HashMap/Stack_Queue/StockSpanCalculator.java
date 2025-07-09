package Stack_Queue_HashMap.Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class StockSpanCalculator {

    public void calculateStockSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            stack.push(i);
        }

        System.out.println("\nStock Spans:");
        for (int i = 0; i < n; i++) {
            System.out.println("Day " + (i + 1) + " (Price: " + prices[i] + ") → Span: " + span[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StockSpanCalculator calculator = new StockSpanCalculator();

        System.out.print("Enter number of days: ");
        int n = scanner.nextInt();
        int[] prices = new int[n];

        System.out.println("Enter stock prices for " + n + " days:");
        for (int i = 0; i < n; i++) {
            System.out.print("Day " + (i + 1) + " price: ");
            prices[i] = scanner.nextInt();
        }

        calculator.calculateStockSpan(prices);

        scanner.close();
    }
}
