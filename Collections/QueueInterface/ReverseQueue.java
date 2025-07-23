package Collections.QueueInterface;
import java.util.*;

public class ReverseQueue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        System.out.print("Enter the number of elements in the Queue: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }

        System.out.println("Queue before reverse: " + queue);

        reverseQueue(queue);

        System.out.println("Queue after reverse: " + queue);
        
        sc.close();
    }

    private static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}
