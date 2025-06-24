public class Student {
    // Attributes
    String name;
    int rollNumber;
    double marks;
    String grade;

    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        
        // Automatically calculate grade when object is created
        this.grade = calculateGrade(); }

    // Method to calculate grade based on marks
    private String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student details and grade
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Student student1 = new Student("Ayush", 101, 85.5);
        Student student2 = new Student("Sneha", 102, 72.0);
        Student student3 = new Student("Ravi", 103, 49.0);

        System.out.println("Student 1 Details:");
        student1.displayDetails();
        System.out.println();

        System.out.println("Student 2 Details:");
        student2.displayDetails();
        System.out.println();

        System.out.println("Student 3 Details:");
        student3.displayDetails();
    }
}
