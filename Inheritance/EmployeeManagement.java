// Superclass
class Employee {
    String name;
    int id;
    int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("<------> Details of Employee <------>");
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("Salary : " + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {
    int teamSize;

    public Manager(String name, int id, int salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size : " + teamSize);
    }
}

// Subclass: Developer
class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int id, int salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language : " + programmingLanguage);
    }
}

// Subclass: Intern
class Intern extends Employee {
    String university;

    public Intern(String name, int id, int salary, String university) {
        super(name, id, salary);
        this.university = university;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("University : " + university);
    }
}

// Main class
public class EmployeeManagement {
    public static void main(String[] args) {
        Employee manager = new Manager("Ayush", 101, 90000, 10);
        Employee developer = new Developer("Bharat", 102, 70000, "Java");
        Employee intern = new Intern("Divya", 103, 20000, "MIT");

        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
        System.out.println();
        intern.displayDetails();
    }
}
