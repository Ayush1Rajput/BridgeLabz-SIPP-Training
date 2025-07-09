package Stack_Queue_HashMap.Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class SortStackUsingRecursion {
    
    public void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            sortStack(stack);
            insertInSortedOrder(stack, top);
        }
    }

    private void insertInSortedOrder(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || value > stack.peek()) {
            stack.push(value);
        } else {
            int temp = stack.pop();
            insertInSortedOrder(stack, value);
            stack.push(temp);
        }
    }

    public void displayStack(Stack<Integer> stack) {
        System.out.println("Sorted Stack (top to bottom):");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortStackUsingRecursion sorter = new SortStackUsingRecursion();
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter the number of elements in the stack: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            int value = scanner.nextInt();
            stack.push(value);
        }

        sorter.sortStack(stack);
        sorter.displayStack(stack);
        
        scanner.close();
    }
}
