package Fundamentals.Level1;

import java.util.Scanner;
public class HeightConverterFromCentimeterToFeetAndInches{
    public static void main(String[] args) {
		//create variables to store height in cm
		double cm;
		
		//Create Scanner object to take user input 
        Scanner input = new Scanner(System.in);
		
		//Take user input and assign to variable cm
		System.out.print("Enter height in cm: ");
        cm = input.nextDouble();
		
		//close Scanner
		input.close();
		
		//Compute height in feet and inches
        double totalInches = cm / 2.54;
        int feet = (int)(totalInches / 12);
        double inches = totalInches % 12;
		
		//Display the height in feet and inches
        System.out.println("Your Height in cm is " + cm + 
			" while in feet is " + feet + " and inches is " + inches);
    }
}