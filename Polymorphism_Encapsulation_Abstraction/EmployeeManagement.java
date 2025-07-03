import java.util.ArrayList;
import java.util.List;

// Abstract class Employee
abstract class Employee {
    private int employeeId;
    private String name;
    private int baseSalary;

    // Parameterized Constructor
    public Employee(int employeeId, String name, int baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getter and Setter methods (Encapsulation)
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Concrete Method to display employee details
    public void displayDetails() {
        System.out.println("\n---- Details of Employee ----");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println();
    }

    // Abstract method to calculate salary
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
        System.out.println("Full-Time Employee Salary: " + fixedSalary);
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

// Department Interface
interface Department {
    void assignDepartment(String departmentName);
    void getDepartmentDetails();
}

// ITDepartment implementing Department interface
class ITDepartment implements Department {
    private String departmentName;

    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department: " + departmentName);
    }
}

// EmployeeManagement Class
public class EmployeeManagement{
    public static void main(String[] args) {
        // Creating FullTimeEmployee
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(101, "Ayush", 30000, 50000);
        fullTimeEmployee.calculateSalary();
        fullTimeEmployee.displayDetails();

        // Creating PartTimeEmployee
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(102, "Karan", 10000, 20, 200);
        partTimeEmployee.calculateSalary();
        partTimeEmployee.displayDetails();

        // Polymorphism: Handling a list of Employees using Employee reference
        List<Employee> employees = new ArrayList<>();
        employees.add(fullTimeEmployee);
        employees.add(partTimeEmployee);

        System.out.println("\n---- Employee Details (Polymorphism) ----");
        for (Employee employee : employees) {
            employee.displayDetails();
            employee.calculateSalary();
        }

        // Create Department and assign it
        ITDepartment itDept = new ITDepartment();
        itDept.assignDepartment("Software Development");
        itDept.getDepartmentDetails();
    }
}
