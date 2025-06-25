public class Student {
    private static String universityName = "GLA University";
    private static int totalStudents = 0;  // for counting the students


    private final String rollNumber;
    private String name;
    private String grade;

    // Constructor using 'this' to initialize student data
    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;

        totalStudents++; // Increment total students
    }

    // Static method to display total students enrolled
    public static void displayTotalStudents() {
        System.out.println("\nTotal students enrolled at " + universityName + ": " + totalStudents);
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    // Method to update the grade (Only if the object is an instance of Student)
    public static void updateGrade(Object obj, String newGrade) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            student.grade = newGrade;
            System.out.println("\nGrade updated successfully for " + student.name);
        } else {
            System.out.println("Object is not a Student.");
        }
    }

    // Method to check if an object is an instance of Student
    public static boolean isStudent(Object obj) {
        return obj instanceof Student;
    }

    public static void main(String[] args) {
        Student student = new Student("Ayush","2215000427","A+");
        student.displayStudentDetails();
    }
}
