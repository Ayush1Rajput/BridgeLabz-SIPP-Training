package LinkedList.CircularLinkedList;

class Task {
    int id;
    String name;
    int priority;
    String dueDate;
    Task next;

    public Task(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

public class TaskScheduler {
    Task head = null;
    Task tail = null;
    Task current = null;

    public void addAtBeginning(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            tail.next = head;
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head;
        }
    }

    public void addAtEnd(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            tail.next = head;
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head;
        }
    }

    public void addAtPosition(int position, int id, String name, int priority, String dueDate) {
        if (position <= 0) return;

        Task newTask = new Task(id, name, priority, dueDate);

        if (position == 1) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        Task temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        newTask.next = temp.next;
        temp.next = newTask;

        if (temp == tail) {
            tail = newTask;
        }
    }

    public void removeById(int id) {
        if (head == null) return;

        if (head.id == id) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }

        Task temp = head;
        do {
            if (temp.next.id == id) {
                if (temp.next == tail) {
                    tail = temp;
                }
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        } while (temp != head);
    }

    public void viewCurrentTask() {
        if (current == null) {
            current = head;
        }
        if (current != null) {
            System.out.println(current.id + " " + current.name + " " + current.priority + " " + current.dueDate);
        }
    }

    public void moveToNextTask() {
        if (current != null) {
            current = current.next;
        }
    }

    public void displayAllTasks() {
        if (head == null) return;

        Task temp = head;
        do {
            System.out.println(temp.id + " " + temp.name + " " + temp.priority + " " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchByPriority(int priority) {
        if (head == null) return;

        Task temp = head;
        do {
            if (temp.priority == priority) {
                System.out.println(temp.id + " " + temp.name + " " + temp.priority + " " + temp.dueDate);
            }
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addAtBeginning(1, "Design Module", 2, "2025-07-10");
        scheduler.addAtEnd(2, "Code Review", 1, "2025-07-12");
        scheduler.addAtPosition(2, 3, "Testing", 3, "2025-07-15");

        scheduler.displayAllTasks();

        scheduler.viewCurrentTask();
        scheduler.moveToNextTask();
        scheduler.viewCurrentTask();

        scheduler.searchByPriority(1);

        scheduler.updateTaskRating(2, 4);  // Not needed, just example if required

        scheduler.removeById(1);

        scheduler.displayAllTasks();
    }
}
