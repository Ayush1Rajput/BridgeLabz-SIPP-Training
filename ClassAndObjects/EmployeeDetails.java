public class EmployeeDetails{

    // Class defination
    static class Employee{
        // Class attributes
        int id;
        String name;
        int salary;

        // Constructer for Employee
        public Employee(String name, int id, int salary){
            this.name = name ;
            this.id = id;
            this.salary = salary;
        }

        // Method to display the details of Employee
        public void display(){
            System.out.println("Employee name : "+this.name);
            System.out.println("Employee id : "+this.id);
            System.out.println("Employee salary : "+this.salary);

        }
    }
    // Main class
    public static void main(String[] args) {

        // Creating the object of Employee
        Employee employee = new Employee("Ayush",21 , 50000);

        // Calling the method for display the details
        employee.display();
    }
}