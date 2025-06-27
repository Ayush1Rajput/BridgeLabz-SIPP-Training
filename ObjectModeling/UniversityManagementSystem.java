import java.util.ArrayList;

// Student class
class Student {
    private String name;
    private int studentId;
    private ArrayList<Course> enrolledCourses;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
        System.out.println(name + " has enrolled in " + course.getCourseName());
    }

    public void showCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course c : enrolledCourses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

// Professor class
class Professor {
    private String name;
    private int professorId;
    private ArrayList<Course> assignedCourses;

    public Professor(int professorId, String name) {
        this.professorId = professorId;
        this.name = name;
        this.assignedCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course course) {
        assignedCourses.add(course);
        course.setProfessor(this);
        System.out.println("Professor " + name + " assigned to course " + course.getCourseName());
    }

    public void showCourses() {
        System.out.println("Courses taught by Professor " + name + ":");
        for (Course c : assignedCourses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

// Course class (aggregates students and professors)
class Course {
    private String courseName;
    private int courseId;
    private Professor professor;
    private ArrayList<Student> enrolledStudents;

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void showDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "Not Assigned"));
        System.out.println("Enrolled Students:");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.getName());
        }
    }
}

// Main class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create students
        Student s1 = new Student(201, "Ayush Raj");
        Student s2 = new Student(202, "Divanshu Sharma");

        // Create professors
        Professor p1 = new Professor(101, "Dr. Mehta");
        Professor p2 = new Professor(102, "Dr. Arora");

        // Create courses
        Course c1 = new Course(301, "Data Structures");
        Course c2 = new Course(302, "Operating Systems");

        // Assign professors
        p1.assignCourse(c1);
        p2.assignCourse(c2);

        // Students enroll in courses
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        // Display information
        System.out.println();
        s1.showCourses();
        System.out.println();
        p1.showCourses();
        System.out.println();
        c1.showDetails();
    }
}
