import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
		//create a variable to store base and height of a triangle
		double base , height;
		
		//create a Scanner object to take user inputs
        Scanner input = new Scanner(System.in);
		
		//Take input and assign to a variable
		System.out.print("Enter a base: ");
        base = input.nextDouble();
		System.out.print("Enter a height: ");
        height = input.nextDouble();
        
		//close Scanner
		input.close();
		
		//Compute area of triangle in cm and in inches
		double areaCm = 0.5 * base * height;
        double areaIn = areaCm / (2.54 * 2.54);
		
		//Display the result
        System.out.println("The Area of the triangle in sq in is " + areaIn + " and sq cm is " + areaCm);
    }
}
