package Stack_Queue_HashMap.Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {
    private Stack<Integer> stackEnqueue;
    private Stack<Integer> stackDequeue;

    public QueueUsingTwoStacks() {
        stackEnqueue = new Stack<>();
        stackDequeue = new Stack<>();
    }

    public void enqueue(int value) {
        stackEnqueue.push(value);
        System.out.println("Enqueued: " + value);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        if (stackDequeue.isEmpty()) {
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }
        int removed = stackDequeue.pop();
        System.out.println("Dequeued: " + removed);
        return removed;
    }

    public boolean isEmpty() {
        return stackEnqueue.isEmpty() && stackDequeue.isEmpty();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1;
        }
        if (stackDequeue.isEmpty()) {
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }
        return stackDequeue.peek();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Check if Queue is Empty");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    int front = queue.peek();
                    if (front != -1) {
                        System.out.println("Front of queue: " + front);
                    }
                    break;
                case 4:
                    System.out.println("Queue is " + (queue.isEmpty() ? "empty." : "not empty."));
                    break;
                case 5:
                    System.out.println("Exiting..");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
