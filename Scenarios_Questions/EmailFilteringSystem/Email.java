package Scenarios_Questions.EmailFilteringSystem;

import java.util.regex.*;

public class Email {
	//Arguments
	private String emailAddress;
	
	// Constructor
	public Email(String email) {
		// Validate email
		if(!isValidEmailAddress(email)) {
			throw new InvalidEmailFormatException("Not a valid Email Address");
		}
		this.emailAddress = email;
	}
	
	// Setter
	public void setEmailAddress(String email) {
		if(!isValidEmailAddress(email)) {
			throw new InvalidEmailFormatException("Not a valid Email Address");
		}
		this.emailAddress = email;
	}
	
	// Getter
	public String getEmailAddress() {
		return this.emailAddress;
	}
	
	// Utility method to validate email
	private boolean isValidEmailAddress(String email) {
		 String regex = "^[a-z0-9_.+-]+@company\\.com$";
	     Pattern pattern = Pattern.compile(regex);
	     Matcher matcher = pattern.matcher(email);
	     return matcher.matches();
	}
}