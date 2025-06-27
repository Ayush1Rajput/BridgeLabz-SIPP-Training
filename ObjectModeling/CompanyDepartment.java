import java.util.ArrayList;

// Company Class
class Company {
    private String companyName;
    private ArrayList<Department> departments;

    // Parameterized Constructor
    public Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    // Method to add a department
    public void addDepartment(String departmentName) {
        Department department = new Department(departmentName);
        departments.add(department);
        System.out.println("Department " + departmentName + " added to " + companyName);
    }

    // Method to add an employee to a specific department
    public void addEmployeeToDepartment(String departmentName, String employeeName, String designation) {
        for (Department department : departments) {
            if (department.getDepartmentName().equals(departmentName)) {
                department.addEmployee(employeeName, designation);
                return;
            }
        }
        System.out.println("Department " + departmentName + " not found in " + companyName);
    }

    // Method to display all departments and their employees
    public void displayCompanyStructure() {
        System.out.println("\nCompany: " + companyName);
        for (Department department : departments) {
            department.displayDepartmentDetails();
        }
    }

    // Method to simulate deletion of the company
    public void deleteCompany() {
        departments.clear();
        System.out.println("\nCompany " + companyName + " and all its departments and employees are deleted.");
    }

    // Inner Department Class (Composition)
    private class Department {
        private String departmentName;
        private ArrayList<Employee> employees;

        // Constructor
        public Department(String departmentName) {
            this.departmentName = departmentName;
            employees = new ArrayList<>();
        }

        // Getter
        public String getDepartmentName() {
            return departmentName;
        }

        // Method to add employee
        public void addEmployee(String employeeName, String designation) {
            Employee employee = new Employee(employeeName, designation);
            employees.add(employee);
            System.out.println("Employee " + employeeName + " added to Department " + departmentName);
        }

        // Method to display department details
        public void displayDepartmentDetails() {
            System.out.println("\nDepartment: " + departmentName);
            for (Employee employee : employees) {
                employee.displayEmployeeDetails();
            }
        }

        // Inner Employee Class (Tightly bound to Department)
        private class Employee {
            private String employeeName;
            private String designation;

            // Constructor
            public Employee(String employeeName, String designation) {
                this.employeeName = employeeName;
                this.designation = designation;
            }

            // Method to display employee details
            public void displayEmployeeDetails() {
                System.out.println("Employee Name: " + employeeName + ", Designation: " + designation);
            }
        }
    }
}

public class CompanyDepartment {
    public static void main(String[] args) {
        // Create company object
        Company company = new Company("Tech Innovators Pvt Ltd");

        // Add departments
        company.addDepartment("Engineering");
        company.addDepartment("Human Resources");
        company.addDepartment("Marketing");

        // Add employees to departments
        company.addEmployeeToDepartment("Engineering", "Ayush ", "Software Engineer");
        company.addEmployeeToDepartment("Engineering", "Divanshu", "Senior Developer");
        company.addEmployeeToDepartment("HR", "Anita Sharma", "HR Manager");
        company.addEmployeeToDepartment("Marketing", "Rohit Kumar", "Digital Marketer");

        // Display full company structure
        company.displayCompanyStructure();

        // Simulate deleting the company
        company.deleteCompany();
    }
}
