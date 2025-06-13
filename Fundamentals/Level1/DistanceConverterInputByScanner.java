

import java.util.Scanner;

class DistanceConverterInputByScanner {
	public static void main(String[] args) {
		// create a variable to store distance in km
		double kilometers;

		// Create scanner object to take input
		Scanner input = new Scanner(System.in);

		// Take input from user and assign to kilometers variable
		kilometers = input.nextDouble();

		// close
		input.close();
		  

		double miles = kilometers*1.6;
		 
				//Display the distance in  miles
		System.out.println("The total miles is "+ miles +
			" mile for the given " +kilometers + " km");
	}
}