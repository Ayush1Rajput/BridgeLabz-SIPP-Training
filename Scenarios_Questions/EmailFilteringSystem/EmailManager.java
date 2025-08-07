package Scenarios_Questions.EmailFilteringSystem;

import java.util.ArrayList;

public class EmailManager {
	ArrayList<Employee> employeeRecords;
	public EmailManager() {
		this.employeeRecords = new ArrayList<>(); 
	}
	
	public void addEmployee(String name,String email) {
		try {
			Employee newEmployee = new Employee(name,email);
			employeeRecords.add(newEmployee);
		}catch(InvalidEmailFormatException e){
			System.out.println(e.getMessage());
		}
	}
	
	public ArrayList<Employee> searchByDomain(String domain) throws NoEmployeeFoundException {
        ArrayList<Employee> result = new ArrayList<>();

        for (Employee employee : employeeRecords) {
            String email = employee.getEmail();
            if (email.endsWith("@" + domain)) {
                result.add(employee);
            }
        }

        if (result.isEmpty()) {
            throw new NoEmployeeFoundException("No employees found with domain: " + domain);
        }
        return result;
    }
}