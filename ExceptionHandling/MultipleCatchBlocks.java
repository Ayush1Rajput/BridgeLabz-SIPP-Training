package ExceptionHandling;

import java.util.Scanner;

public class MultipleCatchBlocks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Enter the index to retrieve: ");
        int index = sc.nextInt();
        

        try {
            int value = numbers[index];  
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }

        sc.close();
	}
}
