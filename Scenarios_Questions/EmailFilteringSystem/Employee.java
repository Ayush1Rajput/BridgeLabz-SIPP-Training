package Scenarios_Questions.EmailFilteringSystem;

public class Employee {
	// Attributes
	private String name; 
	private Email email;
	
	// Constructor
	public Employee(String name,String email) {
		this.email = new Email(email);
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email.getEmailAddress();
	}
	
	public void setEmail(String email) {
		this.email.setEmailAddress(email);
	}
	
	public String toString() {
		return this.name+" "+this.email.getEmailAddress();
	}
}