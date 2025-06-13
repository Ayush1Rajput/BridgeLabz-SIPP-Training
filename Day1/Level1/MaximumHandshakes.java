package day1.level1;

import java.util.Scanner;
public class MaximumHandshakes {
    public static void main(String[] args) {
		// create a variable to store number of students
		int Students;
		
		// create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
		
		//take user input and assign to a variable
		System.out.print("Enter a number of students: ");
        Students = input.nextInt();
		
		// close Scanner object
		input.close();
		
		// compute number of handshakes
        int handshakes = (Students * (Students - 1)) / 2;
		
		//Display the result
        System.out.println("The maximum number of handshakes is " + handshakes);
    }
}