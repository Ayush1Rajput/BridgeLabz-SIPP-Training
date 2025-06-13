
import java.util.Scanner;
public class CalculateTotalPrice {
    public static void main(String[] args) {
	
		// create a variable for unit price and quantity
		double unitPrice;
		int quantity;
		
		//cretae a Scanner Object to take user input
        Scanner input = new Scanner(System.in);
		
		//Take user input and assign to a variable
		System.out.print("Enter a unit price: ");
        unitPrice = input.nextDouble();
		System.out.print("Enter a quantity: ");
        quantity = input.nextInt();
		
		//close scanner object
		input.close();
		
		//compute a total price
        double total = unitPrice * quantity;
		
		//Display the total price
        System.out.println("The total purchase price is INR " + total + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}