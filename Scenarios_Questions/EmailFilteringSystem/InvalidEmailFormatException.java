package Scenarios_Questions.EmailFilteringSystem;

public class InvalidEmailFormatException extends RuntimeException{
	public InvalidEmailFormatException(String message) {
		super(message);
	}
}