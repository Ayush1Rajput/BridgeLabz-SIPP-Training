package Scenarios_Questions.HospitalAppointmentQueue;
import java.util.*;

class QueueManager<T> {
    private Queue<T> queue;

    public QueueManager() {
        queue = new LinkedList<>();
    }

    public void addItem(T item) {
        queue.offer(item);
        System.out.println("Added: " + item);
    }

    public T serveNext() {
        T item = queue.poll();
        if (item != null) {
            System.out.println("Served: " + item);
        } else {
            System.out.println("No item to serve.");
        }
        return item;
    }

    public T peekNext() {
        T item = queue.peek();
        if (item != null) {
            System.out.println("Next in queue: " + item);
        } else {
            System.out.println("Queue is empty.");
        }
        return item;
    }

    public void showAll() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Current Queue:");
            for (T item : queue) {
                System.out.println(item);
            }
        }
    }
}
