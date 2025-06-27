import java.util.ArrayList;

// Course Class
class Course {
    private String courseName;
    private ArrayList<Student> enrolledStudents;

    // Parameterized Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        enrolledStudents = new ArrayList<>();
    }

    // Getter
    public String getCourseName() {
        return courseName;
    }

    // Method to enroll a student
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            System.out.println("Student " + student.getStudentName() + " enrolled in course " + courseName);
        }
    }

    // Method to display all enrolled students
    public void displayEnrolledStudents() {
        System.out.println("\nStudents enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getStudentName());
        }
    }
}

// Student Class
class Student {
    private String studentName;
    private ArrayList<Course> enrolledCourses;

    // Parameterized Constructor
    public Student(String studentName) {
        this.studentName = studentName;
        enrolledCourses = new ArrayList<>();
    }

    // Getter
    public String getStudentName() {
        return studentName;
    }

    // Method to enroll in a course
    public void enrollInCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.enrollStudent(this); // Establish bidirectional association
        }
    }

    // Method to view enrolled courses
    public void viewEnrolledCourses() {
        System.out.println("\nCourses enrolled by " + studentName + ":");
        for (Course course : enrolledCourses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

// School Class (Aggregation)
class School {
    private String schoolName;
    private ArrayList<Student> students;

    // Parameterized Constructor
    public School(String schoolName) {
        this.schoolName = schoolName;
        students = new ArrayList<>();
    }

    // Method to add a student to the school
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student " + student.getStudentName() + " added to " + schoolName);
    }

    // Method to display all students in the school
    public void displayAllStudents() {
        System.out.println("\nStudents in " + schoolName + ":");
        for (Student student : students) {
            System.out.println("- " + student.getStudentName());
        }
    }
}

public class SchoolStudentCourseSystem {
    public static void main(String[] args) {
        // Create a school
        School school = new School("DPS");

        // Create courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course history = new Course("History");

        // Create students
        Student ayush = new Student("Ayush ");
        Student divanshu = new Student("Divanshu");

        // Add students to school (Aggregation)
        school.addStudent(ayush);
        school.addStudent(divanshu);

        // Students enroll in courses (Association)
        ayush.enrollInCourse(math);
        ayush.enrollInCourse(science);

        divanshu.enrollInCourse(science);
        divanshu.enrollInCourse(history);

        // View data
        school.displayAllStudents();

        ayush.viewEnrolledCourses();
        divanshu.viewEnrolledCourses();

        math.displayEnrolledStudents();
        science.displayEnrolledStudents();
        history.displayEnrolledStudents();
    }
}
