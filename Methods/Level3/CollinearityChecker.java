import java.util.Scanner;

public class CollinearityChecker {

    // Method to check collinearity using slope method
    public static boolean arePointsCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        int slopeAB_num = (y2 - y1) * (x3 - x2);
        int slopeBC_num = (y3 - y2) * (x2 - x1);
        return slopeAB_num == slopeBC_num;
    }

    // Method to check collinearity using area of triangle formula
    public static boolean arePointsCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for 3 points
        System.out.print("Enter x1: ");
        int x1 = sc.nextInt();
        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();

        System.out.print("Enter x2: ");
        int x2 = sc.nextInt();
        System.out.print("Enter y2: ");
        int y2 = sc.nextInt();

        System.out.print("Enter x3: ");
        int x3 = sc.nextInt();
        System.out.print("Enter y3: ");
        int y3 = sc.nextInt();

        // Using slope method
        boolean slopeCheck = arePointsCollinearBySlope(x1, y1, x2, y2, x3, y3);

        // Using area method
        boolean areaCheck = arePointsCollinearByArea(x1, y1, x2, y2, x3, y3);

        // Output results
        System.out.println("\nChecking Collinearity using Slope Method: " + (slopeCheck ? "Collinear" : "Not Collinear"));
        System.out.println("Checking Collinearity using Area Method : " + (areaCheck ? "Collinear" : "Not Collinear"));

        sc.close();
    }
}
