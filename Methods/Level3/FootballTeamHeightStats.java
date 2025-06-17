import java.util.Random;

public class FootballTeamHeightStats {

    public static void main(String[] args) {
        // Create an array to store heights of 11 players
        int[] heights = new int[11];

        // Creating Random object to generate random heights
        Random random = new Random();

        // Assign random height between 150 and 250 to each player
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150; // generates values from 150 to 250
        }

        // Display all players' heights
        System.out.print("Heights of 11 players in cms: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println(); // for new line

        // Call methods to perform calculations
        int sum = calculateSumOfHeights(heights);
        double mean = calculateMeanHeight(heights);
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);

        // Display the results
        System.out.println("Total height of all players: " + sum + " cms");
        System.out.printf("Mean height of players: %.2f cms\n", mean);
        System.out.println("Shortest player's height: " + shortest + " cms");
        System.out.println("Tallest player's height: " + tallest + " cms");
    }

    // Method to calculate the sum of all heights
    public static int calculateSumOfHeights(int[] arr) {
        int sum = 0;
        for (int height : arr) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double calculateMeanHeight(int[] arr) {
        int sum = calculateSumOfHeights(arr);
        return (double) sum / arr.length;
    }

    // Method to find the shortest height
    public static int findShortestHeight(int[] arr) {
        int min = arr[0];
        for (int height : arr) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    // Method to find the tallest height
    public static int findTallestHeight(int[] arr) {
        int max = arr[0];
        for (int height : arr) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }
}
