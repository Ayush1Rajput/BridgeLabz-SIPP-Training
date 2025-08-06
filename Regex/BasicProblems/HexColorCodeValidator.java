package Regex.BasicProblems;

import java.util.Scanner;

public class HexColorCodeValidator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Enter the Color Code : ");
    	String colorCode = sc.next();
    	
    	String regex = "^#[A-Fa-f0-9]{6}$";
    	
    	if (colorCode.matches(regex)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
        
        sc.close();

	}

}
