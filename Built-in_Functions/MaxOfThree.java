import java.util.Scanner;

public class MaxOfThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = getInput(sc, "Enter first number: ");
        int num2 = getInput(sc, "Enter second number: ");
        int num3 = getInput(sc, "Enter third number: ");

        int max = findMaximum(num1, num2, num3);

        System.out.println("The maximum of the three numbers is: " + max);

        sc.close(); //close the scanner
    }

    // Function to take input from user
    static int getInput(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    // Function to find maximum of three numbers
    static int findMaximum(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }
}
