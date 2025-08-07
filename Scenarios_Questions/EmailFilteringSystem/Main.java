package Scenarios_Questions.EmailFilteringSystem;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		EmailManager em = new EmailManager();
		ArrayList<String> name =  new ArrayList<String>();
		ArrayList<String> email =  new ArrayList<String>();
		name.add("Rohit");    email.add("rohit@company.com");
		name.add("Sneha");    email.add("sneha@company.com");
		name.add("Vikram");   email.add("vikram123@company.com");
		name.add("Meena");    email.add("meena@company.com");
		name.add("Ishaan");   email.add("ishaan@comany.com");  

		for(int i=0 ;i<name.size();i++) {
			em.addEmployee(name.get(i), email.get(i));
		}
		
		try{
			for(Employee n:em.searchByDomain("company.com")) {
				System.out.println(n.toString());
			}
		}catch(NoEmployeeFoundException e){
			System.out.println(e.getMessage());
		}
	}
}