import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for a, b and c
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        // Calling method to find roots
        double[] roots = findRoots(a, b, c);

        // Checking roots array and displaying results
        if (roots.length == 2) {
            System.out.println("Two roots are: " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("One root is: " + roots[0]);
        } else {
            System.out.println("No real roots exist.");
        }

        sc.close();
    }

    // Method to find roots of quadratic equation ax^2 + bx + c = 0
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] {root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[] {root};
        } else {
            // No real roots
            return new double[] {};
        }
    }
}
