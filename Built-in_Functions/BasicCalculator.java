import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take two numbers as input
        double num1 = takeNumberInput(sc, "Enter the first number: ");
        double num2 = takeNumberInput(sc, "Enter the second number: ");

        // Ask user for the desired operation
        int operation = takeOperationChoice(sc);

        // Perform the chosen operation
        double result = performOperation(num1, num2, operation);

        // Display the result
        displayResult(num1, num2, result, operation);

        sc.close();
    }

    // Method to take a number input from the user
    static double takeNumberInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextDouble();
    }

    // Method to ask user which operation to perform
    static int takeOperationChoice(Scanner sc) {
        System.out.println("\nChoose an operation to perform:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();
        System.out.println();
        return choice;
    }

    // Method to perform the selected operation
    static double performOperation(double a, double b, int choice) {
        switch (choice) {
            case 1:
                return add(a, b);
            case 2:
                return subtract(a, b);
            case 3:
                return multiply(a, b);
            case 4:
                return divide(a, b);
            default:
                System.out.println("Invalid operation selected. Returning 0.");
                return 0;
        }
    }

    // Addition method
    static double add(double a, double b) {
        return a + b;
    }

    // Subtraction method
    static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication method
    static double multiply(double a, double b) {
        return a * b;
    }

    // Division method (handles divide-by-zero)
    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return 0;
        }
        return a / b;
    }

    // Method to display the result
    static void displayResult(double a, double b, double result, int operation) {
        String operator;
        switch (operation) {
            case 1: operator = "+"; break;
            case 2: operator = "-"; break;
            case 3: operator = "*"; break;
            case 4: operator = "/"; break;
            default: operator = "?";
        }

        System.out.println("Result: " + a + " " + operator + " " + b + " = " + result);
        System.out.println();
    }
}
