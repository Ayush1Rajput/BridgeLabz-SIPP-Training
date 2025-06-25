public class EmployeeTest {

    // Base class
    static class Employee {
        public String employeeID;         // Public
        protected String department;      // Protected
        private double salary;            // Private

        // Constructor
        public Employee(String employeeID, String department, double salary) {
            this.employeeID = employeeID;
            this.department = department;
            this.salary = salary;
        }

        // Public method to modify salary
        public void modifySalary(double newSalary) {
            if (newSalary >= 0) {
                this.salary = newSalary;
            } else {
                System.out.println("Invalid salary amount.");
            }
        }

        // Getter for salary
        public double getSalary() {
            return salary;
        }
    }

    // Subclass
    static class Manager extends Employee {
        private int teamSize;

        public Manager(String employeeID, String department, double salary, int teamSize) {
            super(employeeID, department, salary);
            this.teamSize = teamSize;
        }

        public void displayInfo() {
            System.out.println("Manager ID: " + employeeID);     // Accessing public field
            System.out.println("Department: " + department);     // Accessing protected field
            System.out.println("Team Size: " + teamSize);
            System.out.println("Salary: " + getSalary());        // Accessing private field via getter
        }
    }

    // Main method to test
    public static void main(String[] args) {
        Employee emp = new Employee("E101", "HR", 40000);
        emp.modifySalary(45000);
        System.out.println("Employee Salary: " + emp.getSalary());

        Manager mgr = new Manager("M202", "Finance", 70000, 5);
        mgr.displayInfo();
    }
}
