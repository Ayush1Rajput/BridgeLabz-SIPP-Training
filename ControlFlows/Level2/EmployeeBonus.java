package ControlFlows.Level2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.println("Enter your current salary: ");
        double salary = sc.nextDouble();

        System.out.println("Enter your years of service: ");
        int yearsOfService = sc.nextInt();

        // close the scanner
        sc.close();

        // check if years of service is more than 5
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: ₹" + bonus);
        } else {
            System.out.println("No bonus as years of service is less than or equal to 5.");
        }
    }
}
