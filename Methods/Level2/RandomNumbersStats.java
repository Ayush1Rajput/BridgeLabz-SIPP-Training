import java.util.*;

public class RandomNumbersStats {

    public static void main(String[] args) {
        // Generate 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Display the generated numbers
        System.out.println("Generated numbers: " + Arrays.toString(randomNumbers));

        // Find average, min and max values
        double[] results = findAverageMinMax(randomNumbers);

        // Display the results
        System.out.printf("Average: %.2f\n", results[0]);
        System.out.println("Minimum: " + (int) results[1]);
        System.out.println("Maximum: " + (int) results[2]);
    }

    // Method to generate array of 4-digit random numbers of given size
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            // Generate random number between 1000 and 9999 inclusive
            arr[i] = 1000 + (int)(Math.random() * 9000);
        }

        return arr;
    }

    // Method to find average, min and max of an array
    // Returns double array with [average, min, max]
    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;

        return new double[] {average, min, max};
    }
}
