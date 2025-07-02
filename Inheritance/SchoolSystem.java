// Superclass
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass: Teacher
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

// Subclass: Student
class Student extends Person {
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

// Subclass: Staff
class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

// Test class
public class SchoolSystem{
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Vijay", 35, "Mathematics");
        Student student = new Student("Ayush", 16, 10);
        Staff staff = new Staff("Pramod", 40, "Administration");

        System.out.println("---- Teacher ----");
        teacher.displayDetails();
        teacher.displayRole();

        System.out.println("---- Student ----");
        student.displayDetails();
        student.displayRole();

        System.out.println("---- Staff ----");
        staff.displayDetails();
        staff.displayRole();
    }
}
