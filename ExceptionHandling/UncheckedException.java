package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st Number : ");
		int num1 = sc.nextInt();

		System.out.print("Enter the 2nd Number : ");
		int num2 = sc.nextInt();
		
		getResult(num1, num2);
		
		sc.close();

	}

	private static void getResult(int num1, int num2) {
		try {
			int result = num1/num2;
			System.out.println("Answer : "+ result);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(InputMismatchException e) {
			System.out.println(e);
		}
		
	}

}
