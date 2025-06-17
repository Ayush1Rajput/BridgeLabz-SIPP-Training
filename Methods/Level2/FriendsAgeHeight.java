import java.util.Scanner;

public class FriendsAgeHeight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays to store ages and heights of 3 friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Ayush", "Karan", "Navdeep"};

        // Taking input for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + " in cm: ");
            heights[i] = sc.nextDouble();
        }

        // Find youngest friend
        int youngestIndex = findYoungest(ages);
        System.out.println("Youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex]);

        // Find tallest friend
        int tallestIndex = findTallest(heights);
        System.out.println("Tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm");

        sc.close();
    }

    // Method to find index of youngest friend
    public static int findYoungest(int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Method to find index of tallest friend
    public static int findTallest(double[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
