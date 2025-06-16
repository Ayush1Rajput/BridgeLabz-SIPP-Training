import java.util.*;

public class StoreAndSumValues {
    public static void main(String[] args) {

        // creating the scanner class
        Scanner sc = new Scanner(System.in);

        // creating an array of 10 elements of type double
        double[] numbers = new double[10];

        // variable to store total sum
        double total = 0.0;

        // index variable to track array position
        int index = 0;

        System.out.println("Enter up to 10 numbers (enter 0 or negative number to stop):");

        // infinite while loop for user input
        while (true) {
            double input = sc.nextDouble();

            // check if user entered 0 or a negative number
            if (input <= 0) {
                break;
            }

            // check if index reached array limit
            if (index == 10) {
                break;
            }

            // storing the value and increasing index
            numbers[index] = input;
            index++;
        }

        // loop to calculate the sum of entered numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // displaying the entered numbers
        System.out.println();
        System.out.println("Numbers Entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        // displaying the total sum
        System.out.println("Total Sum: " + total);

        // closing the scanner class
        sc.close();
    }
}
