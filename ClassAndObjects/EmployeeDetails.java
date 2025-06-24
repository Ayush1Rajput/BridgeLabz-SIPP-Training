public class EmployeeDetails{
    static class Employee{
        int id;
        String name;
        int salary;

        public Employee(String name, int id, int salary){
            this.name = name ;
            this.id = id;
            this.salary = salary;
        }

        public void display(){
            System.out.println("Employee name : "+this.name);
            System.out.println("Employee id : "+this.id);
            System.out.println("Employee salary : "+this.salary);

        }
    }
    public static void main(String[] args) {
        Employee employee = new Employee("Ayush",21 , 50000);

        employee.display();
    }
}