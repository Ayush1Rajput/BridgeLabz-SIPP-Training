public class NullPointerDemo {

    public static void main(String[] args) {

        System.out.println();
        
        // Call method that generates the exception
        System.out.println("Calling method to generate NullPointerException:");
        generateNullPointer();

        System.out.println();

        // Call method that handles the exception
        System.out.println("Calling method to handle NullPointerException using try-catch:");
        handleNullPointer();
    }

    // Method to generate NullPointerException
    public static void generateNullPointer() {
        String text = null; // Initialize variable to null

        // This will throw NullPointerException
        System.out.println("Trying to get length of null string");
        System.out.println("Length of string: " + text.length()); // Exception occurs here
    }

    // Method to handle NullPointerException using try-catch
    public static void handleNullPointer() {
        String text = null; // Initialize variable to null

        try {
            // Attempting to call method on null reference
            System.out.println("Trying to get length of null string");
            System.out.println("Length of string: " + text.length());
        } catch (NullPointerException e) {
            // Handling exception
            System.out.println("NullPointerException caught! You are trying to use a method on a null object.");
        }
    }
}
