package Collections.QueueInterface;
import java.util.*;

public class StackUsingQueues {

    static class MyStack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        // Push operation
        public void push(int x) {
            q2.add(x);

            // Move all elements from q1 to q2
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }

            // Swap the names of q1 and q2
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        // Pop operation
        public int pop() {
            if (q1.isEmpty()) {
                throw new NoSuchElementException("Stack is empty");
            }
            return q1.remove();
        }

        // Top operation
        public int top() {
            if (q1.isEmpty()) {
                throw new NoSuchElementException("Stack is empty");
            }
            return q1.peek();
        }

        // Check if stack is empty
        public boolean isEmpty() {
            return q1.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top());  
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top after pop: " + stack.top());
    }
}
