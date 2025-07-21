package Scenario_Based_Question.DailyTaskPlanner;

import java.util.LinkedList;
import java.util.Scanner;

// Abstract Task class
abstract class Task {
    protected String title;
    protected String time;

    public Task(String title, String time) {
        this.title = title;
        this.time = time;
    }

    public abstract void execute();

    public boolean containsKeyword(String keyword) {
        return title.toLowerCase().contains(keyword.toLowerCase());
    }
}

// Meeting subclass
class Meeting extends Task {
    private String withWhom;

    public Meeting(String title, String time, String withWhom) {
        super(title, time);
        this.withWhom = withWhom;
    }

    @Override
    public void execute() {
        System.out.println("Meeting: " + title + " with " + withWhom + " at " + time);
    }
}

// Workout subclass
class Workout extends Task {
    private String activityType;

    public Workout(String title, String time, String activityType) {
        super(title, time);
        this.activityType = activityType;
    }

    @Override
    public void execute() {
        System.out.println("Workout: " + title + " - " + activityType + " at " + time);
    }
}

// CodingSession subclass
class CodingSession extends Task {
    private String projectName;

    public CodingSession(String title, String time, String projectName) {
        super(title, time);
        this.projectName = projectName;
    }

    @Override
    public void execute() {
        System.out.println("Coding Session: " + title + " for project " + projectName + " at " + time);
    }
}

// Main class
public class DailyTaskPlanner {
    public static void main(String[] args) {
        LinkedList<Task> tasks = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Add sample tasks
        tasks.add(new Meeting("Team Sync", "10:00 AM", "Project Team"));
        tasks.add(new Workout("Morning Yoga", "7:00 AM", "Stretching"));
        tasks.add(new CodingSession("Feature Implementation", "2:00 PM", "Custom Calendar App"));

        // Execute all tasks
        System.out.println("Today's Task List:");
        for (Task task : tasks) {
            task.execute();
        }

        // Search by keyword
        System.out.print("\nSearch Task by keyword: ");
        String keyword = scanner.nextLine();

        boolean found = false;
        for (Task task : tasks) {
            if (task.containsKeyword(keyword)) {
                System.out.println("Match found:");
                task.execute();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No task found matching the keyword.");
        }

        scanner.close();
    }
}
