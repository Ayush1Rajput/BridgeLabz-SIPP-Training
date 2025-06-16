package Arrays.Level2;

import java.util.*;

public class ZaraBonusCalculator {
    public static void main(String[] args) {

        // creating the scanner class
        Scanner sc = new Scanner(System.in);

        // declaring arrays to store data for 10 employees
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonusAmount = new double[10];
        double[] newSalary = new double[10];

        // variables to hold total values
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // getting input from the user for each employee
        System.out.println("Enter details for 10 employees:");
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");

            // input salary
            System.out.print("Enter salary: ");
            double sal = sc.nextDouble();

            // input years of service
            System.out.print("Enter years of service: ");
            double years = sc.nextDouble();

            // validating inputs
            if (sal <= 0 || years < 0) {
                System.err.println("Invalid input. Salary must be positive and years of service must be non-negative. Please enter again.");
                i--; // repeat this index
                continue;
            }

            // storing valid input
            salary[i] = sal;
            yearsOfService[i] = years;
        }

        // calculating bonus, new salary, and totals
        for (int i = 0; i < 10; i++) {
            double bonus;

            if (yearsOfService[i] > 5) {
                bonus = salary[i] * 0.05;
            } else {
                bonus = salary[i] * 0.02;
            }

            bonusAmount[i] = bonus;
            newSalary[i] = salary[i] + bonus;

            totalBonus += bonus;
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // displaying individual employee bonus and new salary
        System.out.println();
        System.out.println("Employee-wise Bonus and New Salary:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f\n",
                    (i + 1), salary[i], bonusAmount[i], newSalary[i]);
        }

        // displaying the totals
        System.out.println();
        System.out.println("Zara Bonus Summary:");
        System.out.printf("Total Old Salary of All Employees: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Paid: %.2f\n", totalBonus);
        System.out.printf("Total New Salary of All Employees: %.2f\n", totalNewSalary);

        // closing the scanner
        sc.close();
    }
}
