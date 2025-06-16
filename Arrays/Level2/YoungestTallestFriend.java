package Arrays.Level2;

import java.util.*;

public class YoungestTallestFriend {
    public static void main(String[] args) {

        // creating the scanner class
        Scanner sc = new Scanner(System.in);

        // array to store the names of the friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // arrays to store age and height of the friends
        int[] age = new int[3];
        double[] height = new double[3];

        // getting input from the user
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i] + ":");

            System.out.print("Enter age: ");
            age[i] = sc.nextInt();

            System.out.print("Enter height (in cm): ");
            height[i] = sc.nextDouble();
        }

        // finding the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // finding the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // displaying results
        System.out.println();
        System.out.println("Result:");
        System.out.println("The youngest friend is " + names[youngestIndex] + " with age " + age[youngestIndex] + " years.");
        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + height[tallestIndex] + " cm.");

        // closing the scanner class
        sc.close();
    }
}
