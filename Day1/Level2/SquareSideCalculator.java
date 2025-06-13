import java.util.Scanner;
class SquareSideCalculator{
    public static void main(String[] args) {
		//create a variable to store perimeter of square
		double perimeter;
		
		//create Scanner object to take inputs
        Scanner input = new Scanner(System.in);
		
		//Take input and assign to perimeter variable
		System.out.print("Enter a perimeter of a square: ");
        perimeter = input.nextDouble();
		
		//close Scanner
		input.close();
		
		//compute side of square
        double side = perimeter / 4;
		
		//display the side of square
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}