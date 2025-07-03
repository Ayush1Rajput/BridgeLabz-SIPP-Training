// Abstract class Employee
abstract class Employee {
    private int employeeId;
    private String name;
    private int baseSalary;

    // Parameterized Constructor
    public Employee(int employeeId, String name, int baseSalary) {
        this.baseSalary = baseSalary;
        this.name = name;
        this.employeeId = employeeId;
    }

    // Getter methods (Encapsulation)
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    // Setter methods
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Concrete Method to display employee details
    public void displayDetails() {
        System.out.println("\n---- Details of Employee ----");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println();
    }

    // Abstract method to be implemented by subclasses
    abstract void calculateSalary();
}

// FullTimeEmployee subclass
class FullTimeEmployee extends Employee {
    private int fixedSalary;

    // Constructor
    public FullTimeEmployee(int employeeId, String name, int baseSalary, int fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }

    // Setter for fixedSalary
    public void setFixedSalary(int fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    void calculateSalary() {
        System.out.println("Full-Time Employee Fixed Salary: " + fixedSalary);
    }
}

// PartTimeEmployee subclass
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private int hourlyRate;

    // Constructor
    public PartTimeEmployee(int employeeId, String name, int baseSalary, int hoursWorked, int hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Setter methods for hoursWorked and hourlyRate
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void calculateSalary() {
        int salary = hoursWorked * hourlyRate;
        System.out.println("Part-Time Employee Salary: " + salary);
    }
}

// EmployeeManagement Class
public class EmployeeManagement {
    public static void main(String[] args) {
        // Creating FullTimeEmployee 
        FullTimeEmployee fl = new FullTimeEmployee(121, "Ayush", 1234, 50000);
        fl.calculateSalary();
        fl.displayDetails();

        // Creating PartTimeEmployee 
        PartTimeEmployee pt = new PartTimeEmployee(1010, "Karan", 30000, 20, 500);
        pt.calculateSalary();
        pt.displayDetails();
    }
}
