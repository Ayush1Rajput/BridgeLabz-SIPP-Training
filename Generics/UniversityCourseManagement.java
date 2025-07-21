package Generics;



import java.util.ArrayList;
import java.util.List;

// Abstract base class for course type
abstract class CourseType {
    protected String title;
    protected int credits;

    public CourseType(String title, int credits) {
        this.title = title;
        this.credits = credits;
    }

    public abstract void showDetails();
}

// Exam-based course class
class ExamCourse extends CourseType {
    private int examWeightage;

    public ExamCourse(String title, int credits, int examWeightage) {
        super(title, credits);
        this.examWeightage = examWeightage;
    }

    @Override
    public void showDetails() {
        System.out.println("Exam Course - Title: " + title + ", Credits: " + credits + ", Exam Weightage: " + examWeightage + "%");
    }
}

// Assignment-based course class
class AssignmentCourse extends CourseType {
    private int numberOfAssignments;

    public AssignmentCourse(String title, int credits, int numberOfAssignments) {
        super(title, credits);
        this.numberOfAssignments = numberOfAssignments;
    }

    @Override
    public void showDetails() {
        System.out.println("Assignment Course - Title: " + title + ", Credits: " + credits + ", Assignments: " + numberOfAssignments);
    }
}

// Research-based course class
class ResearchCourse extends CourseType {
    private String topic;

    public ResearchCourse(String title, int credits, String topic) {
        super(title, credits);
        this.topic = topic;
    }

    @Override
    public void showDetails() {
        System.out.println("Research Course - Title: " + title + ", Credits: " + credits + ", Topic: " + topic);
    }
}

// Generic Course class for handling courses of type T
class Course<T extends CourseType> {
    private List<T> courseList;

    public Course() {
        courseList = new ArrayList<>();
    }

    public void addCourse(T course) {
        courseList.add(course);
        System.out.println("Course added: " + course.title);
    }

    public List<T> getAllCourses() {
        return courseList;
    }
}

// Utility class to handle wildcards
class CourseManager {
    public static void printCourseDetails(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.showDetails();
        }
    }
}

// Main class
public class UniversityCourseManagement {
    public static void main(String[] args) {

        // Create containers for different types of courses
        Course<ExamCourse> examCourses = new Course<>();
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        Course<ResearchCourse> researchCourses = new Course<>();

        // Add exam-based courses
        examCourses.addCourse(new ExamCourse("Operating Systems", 4, 70));
        examCourses.addCourse(new ExamCourse("Database Systems", 3, 60));

        // Add assignment-based courses
        assignmentCourses.addCourse(new AssignmentCourse("Web Development", 3, 5));
        assignmentCourses.addCourse(new AssignmentCourse("OOP with Java", 2, 4));

        // Add research-based courses
        researchCourses.addCourse(new ResearchCourse("AI for Medicine", 4, "Deep Learning Models"));
        researchCourses.addCourse(new ResearchCourse("Quantum Computing", 3, "Quantum Algorithms"));

        // Display all course details by type
        System.out.println("\nExam-Based Courses:");
        CourseManager.printCourseDetails(examCourses.getAllCourses());

        System.out.println("\nAssignment-Based Courses:");
        CourseManager.printCourseDetails(assignmentCourses.getAllCourses());

        System.out.println("\nResearch-Based Courses:");
        CourseManager.printCourseDetails(researchCourses.getAllCourses());
    }
}
