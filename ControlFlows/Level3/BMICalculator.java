import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {
        // Creating scanner class
        Scanner sc = new Scanner(System.in);

        // Getting weight input from user
        System.out.print("Enter weight (in kg): ");
        double weight = sc.nextDouble();

        // Getting height input from user
        System.out.print("Enter height (in cm): ");
        double heightCm = sc.nextDouble();

        // Converting height from cm to meters
        double heightMeters = heightCm / 100;

        // Calculating BMI
        double bmi = weight / (heightMeters * heightMeters);

        // Displaying BMI value
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Determining weight status using standard BMI table
        if (bmi < 18.5) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Weight Status: Normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }

        // Closing the scanner class
        sc.close();
    }
}
