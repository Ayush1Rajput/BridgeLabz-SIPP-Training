import java.util.*;

public class ArrayIndexExceptionDemo {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Define an array of names
        String[] names = {"Ayush", "Divanshu", "Riya", "Karan", "Simran"};

        // Show total elements in array
        System.out.println("Array contains " + names.length + " names.");

        // Take index input from user
        System.out.print("Enter index to access name (0 to " + (names.length - 1) + "): ");
        int index = sc.nextInt();

        System.out.println();

        // Call method to generate ArrayIndexOutOfBoundsException
        System.out.println("Calling method to generate ArrayIndexOutOfBoundsException:");
        generateException(names, index);

        System.out.println();

        // Call method to handle ArrayIndexOutOfBoundsException using try-catch
        System.out.println("Calling method to handle ArrayIndexOutOfBoundsException:");
        handleException(names, index);

        sc.close(); // close scanner
    }

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names, int index) {
        // Trying to access element at given index
        System.out.println("Accessing element at index " + index + "...");
        String name = names[index]; // This will throw exception if index is invalid
        System.out.println("Name at index " + index + ": " + name);
    }

    // Method to handle ArrayIndexOutOfBoundsException using try-catch
    public static void handleException(String[] names, int index) {
        try {
            // Trying to access element at given index
            System.out.println("Accessing element at index " + index + "...");
            String name = names[index];
            System.out.println("Name at index " + index + ": " + name);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
            System.out.println("You tried to access index " + index + ", which is outside the valid range (0 to " + (names.length - 1) + ").");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught!");
        }
    }
}
