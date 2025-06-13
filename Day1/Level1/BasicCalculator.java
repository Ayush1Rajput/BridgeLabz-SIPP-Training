package day1.level1;

import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
		//create a variable number1 and number2
		double number1 , number2;
		
		//create Scanner object to take inputs
        Scanner input = new Scanner(System.in);
		
		//take to number from user and assign to number1 and number2
		System.out.print("Enter a first number: ");
        number1 = input.nextDouble();
		System.out.print("Enter a Second number: ");
        number2 = input.nextDouble();
		
		//close Scanner
		input.close();
		
		//compute operation on number
        double add = number1 + number2;
        double sub = number1 - number2;
        double mul = number1 * number2;
        double div = number1 / number2;
		
		//Display the result
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
		+ number1 + " and " + number2 + " is " + add + ", " + sub + ", " + mul + ", and " + div);
    }
}