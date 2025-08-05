package ExceptionHandling;

import java.util.Scanner;

public class NestedTryCatch {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int[] numbers = {10, 20, 30, 40, 50}; 

	        try {
	            System.out.print("Enter the index of the element to access: ");
	            int index = sc.nextInt();

	            try {
	            	
	                System.out.print("Enter the divisor: ");
	                int divisor = sc.nextInt();

	                int result = numbers[index] / divisor;
	                System.out.println("Result: " + result);
	            } catch (ArithmeticException e) {
	                System.out.println("Cannot divide by zero!");
	            }

	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Invalid array index!");
	        }

	        sc.close();
	    }
}
