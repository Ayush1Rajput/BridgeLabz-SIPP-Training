package Fundamentals.Level1;

import java.util.Scanner;
class CalculaterFeeAfterDiscount{
	public static void main (String [] args){
		//create a variable to store fee and discount
		double fee , discountPercent;
		
		//Create Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		//take input such as fee and discount and assign to variable fee and discount
		System.out.print("Enter a fee amount : ");
		fee = input.nextDouble();
		System.out.print("Enter a discount in percentage: ");
		discountPercent = input.nextDouble();
		
		//close Scanner
		input.close();
		
		//Compute discount and assign to discount variable
		double discount = Math.floor((fee*discountPercent)/100);
		
		//Display the discount and fee after discount
		System.out.println("The discount amount is INR "+discount+
			" and final discounted fee is INR "+ (fee-discount));
	}
}