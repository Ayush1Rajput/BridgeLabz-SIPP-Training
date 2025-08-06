package Regex.BasicProblems;

import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Enter the Username : ");
    	String username = sc.next();
    	String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,15}$";

        if (username.matches(regex)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
        
        sc.close();
    }
}
