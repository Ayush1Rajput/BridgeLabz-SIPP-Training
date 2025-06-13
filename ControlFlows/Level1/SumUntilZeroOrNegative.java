import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // initializing total sum variable
        double total = 0.0;

        // starting infinite loop
        while (true) {
            // taking input from user
            System.out.println("Enter a number (0 or negative to stop): ");
            double number = sc.nextDouble();

            // check if input is 0 or negative
            if (number <= 0) {
                break;
            }

            // add the number to total
            total += number;
        }

        // close the scanner
        sc.close();

        // display the final total
        System.out.println("The total sum is: " + total);
    }
}
