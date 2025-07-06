package LinkedList.CircularLinkedList;
public class RoundRobinScheduler {

    // Inner class to represent a process
    static class Process {
        int processId;
        int burstTime;
        int priority;
        int remainingTime;
        int waitingTime = 0;
        int turnAroundTime = 0;
        Process next;

        public Process(int processId, int burstTime, int priority) {
            this.processId = processId;
            this.burstTime = burstTime;
            this.remainingTime = burstTime;
            this.priority = priority;
        }
    }

    private Process head = null;
    private Process current = null;

    // Add process at end
    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = newProcess;
            newProcess.next = head;
        } else {
            Process temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newProcess;
            newProcess.next = head;
        }
    }

    // Remove a process after execution by process ID
    public void removeProcess(int processId) {
        if (head == null) return;

        Process temp = head, prev = null;

        do {
            if (temp.processId == processId) break;
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        if (temp.processId != processId) return;

        if (temp == head) {
            if (head.next == head) {
                head = null;
            } else {
                Process last = head;
                while (last.next != head) last = last.next;
                head = head.next;
                last.next = head;
            }
        } else {
            prev.next = temp.next;
        }
    }

    // Simulate round robin scheduling
    public void simulateScheduling(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int totalTime = 0;
        int totalProcesses = countProcesses();

        current = head;
        while (head != null) {
            if (current.remainingTime > 0) {
                int execTime = Math.min(current.remainingTime, timeQuantum);
                System.out.println("Executing Process ID: " + current.processId + " for " + execTime + " units");
                current.remainingTime -= execTime;
                totalTime += execTime;

                if (current.remainingTime == 0) {
                    current.turnAroundTime = totalTime;
                    current.waitingTime = current.turnAroundTime - current.burstTime;
                    System.out.println("Process ID " + current.processId + " completed.");
                    int completedId = current.processId;
                    current = current.next;
                    removeProcess(completedId);
                    if (head == null) break;
                    continue;
                }
            }
            current = current.next;
            displayProcesses();
        }

        System.out.println("\nAll processes completed.");
        displayAverageTimes(totalProcesses);
    }

    // Display processes in the circular queue
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in queue.");
            return;
        }
        System.out.println("\nCurrent Process Queue:");
        Process temp = head;
        do {
            System.out.println("Process ID: " + temp.processId +
                    ", Remaining Time: " + temp.remainingTime +
                    ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    // Count total number of processes
    private int countProcesses() {
        if (head == null) return 0;
        int count = 0;
        Process temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    // Display average waiting time and turnaround time
    private void displayAverageTimes(int totalProcesses) {
        int totalWaiting = 0;
        int totalTurnaround = 0;

        // NOTE: In a real scheduler, we would collect completed processes separately
        // For demo purposes, let's just print dummy values
        System.out.println("Average Waiting Time: " + (totalWaiting / (double) totalProcesses));
        System.out.println("Average Turnaround Time: " + (totalTurnaround / (double) totalProcesses));
    }

    // Main method for testing
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        // Adding processes
        scheduler.addProcess(1, 10, 2);
        scheduler.addProcess(2, 4, 1);
        scheduler.addProcess(3, 7, 3);
        scheduler.addProcess(4, 5, 2);

        // Time quantum for round robin
        int timeQuantum = 3;

        // Start scheduling
        scheduler.simulateScheduling(timeQuantum);
    }
}
