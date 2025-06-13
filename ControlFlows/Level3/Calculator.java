import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        // Creating scanner class
        Scanner sc = new Scanner(System.in);

        // Getting first number input
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        // Getting second number input
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        // Getting operator input
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        // Variable to store result
        double result;

        // Using switch case to perform operations
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;

            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;

            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;

            case "/":
                if (second == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = first / second;
                    System.out.println("Result: " + result);
                }
                break;

            default:
                System.out.println("Invalid Operator");
                break;
        }

        // Closing scanner class
        sc.close();
    }
}
