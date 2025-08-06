package Regex.BasicProblems;

import java.util.Scanner;

public class LicensePlateValidator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Enter the Plate Number : ");
    	String plateNumber = sc.next();
    	
    	String regex = "^[A-Z]{2}\\d{4}$";
    	
    	if (plateNumber.matches(regex)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
        
        sc.close();
	}

}
