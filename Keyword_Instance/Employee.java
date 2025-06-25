public class Employee {
    static String companyName = "Netflix";
    static int totalEmployees = 0;

    private int id;
    private String name;
    private String designation;

    // Parameterized constructor
    public Employee(int id, String name, String designation){
        this.id = id;
        this.name = name;
        this.designation = designation;
    }

    // Static method for display the total number of employee
    public static void displayTotalEmployees(){
        System.out.println("\nTotal employees in the company are : " + totalEmployees);
    }

    public void displayDetails(){

        if(this instanceof Employee){
            System.out.println("\nCompany Name : "+ companyName);
            System.out.println("Employee id : "+ id);
            System.out.println("Employee name : "+ name);
            System.out.println("Employee designation : "+ designation);
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1012,"Ayush","Full Stack developer");

        employee.displayDetails();
    }
}
