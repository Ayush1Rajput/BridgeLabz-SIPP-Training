import java.util.*;

public class MeanHeightOfTeam {
    public static void main(String[] args) {

        // creating the scanner class
        Scanner sc = new Scanner(System.in);

        // creating a double array of size 11 to store player heights
        double[] heights = new double[11];

        // variable to store the sum of all heights
        double sum = 0.0;

        System.out.println("Enter the heights of 11 football players:");

        // loop to take user input and calculate sum
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        // calculating the mean height
        double mean = sum / 11;

        // printing the mean height of the football team
        System.out.println("The mean height of the football team is: " + mean);

        // closing the scanner class
        sc.close();
    }
}
