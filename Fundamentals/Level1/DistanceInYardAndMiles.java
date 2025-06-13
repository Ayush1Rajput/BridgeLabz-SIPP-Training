package Fundamentals.Level1;

import java.util.Scanner;
public class DistanceInYardAndMiles{
    public static void main(String[] args) {
		//create a variable feet
		double feet;
		
		// Create a Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		//Taking user input and assign into variable
		System.out.print("Enter a distance in feet: ");
        feet = input.nextDouble();
		
		//close Scanner object
		input.close();
		
		//compute distance in yard and miles
        double yards = feet / 3;
        double miles = yards / 1760;
		
		//display the result
        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
    }
}