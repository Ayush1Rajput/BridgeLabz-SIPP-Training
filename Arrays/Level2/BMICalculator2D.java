package Arrays.Level2;

import java.util.*;

public class BMICalculator2D {
    public static void main(String[] args) {

        // creating the scanner class
        Scanner sc = new Scanner(System.in);

        // taking input for number of persons
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        // creating 2D array to store weight, height, and BMI
        double[][] personData = new double[number][3];  // [][0] = weight, [][1] = height, [][2] = BMI

        // creating array to store weight status
        String[] weightStatus = new String[number];

        // taking input for each person's height and weight
        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            // input and validation for weight
            while (true) {
                System.out.print("Enter weight in kg: ");
                double weight = sc.nextDouble();
                if (weight > 0) {
                    personData[i][0] = weight;
                    break;
                } else {
                    System.out.println("Please enter a valid positive weight.");
                }
            }

            // input and validation for height
            while (true) {
                System.out.print("Enter height in meters: ");
                double height = sc.nextDouble();
                if (height > 0) {
                    personData[i][1] = height;
                    break;
                } else {
                    System.out.println("Please enter a valid positive height.");
                }
            }
        }

        // calculating BMI and determining weight status
        for (int i = 0; i < number; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];

            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // displaying the BMI report
        System.out.println("--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][1] + " m");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.printf("BMI: %.2f\n", personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);

        }

        // closing the scanner
        sc.close();
    }
}
