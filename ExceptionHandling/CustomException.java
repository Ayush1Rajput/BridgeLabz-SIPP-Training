package ExceptionHandling;

import java.util.Scanner;

// extend the exception class for user define exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        
        int age = sc.nextInt();

        try {
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        
        sc.close();
	}
	
	 // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            System.out.println("Access granted!");
        }
    }
}
