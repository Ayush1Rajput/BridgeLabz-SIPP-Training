public class Course {
    // Instance variables
    private String courseName;
    private int duration; // in weeks or months
    private double fee;

    // Class variable
    private static String instituteName = "Default Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute : " + instituteName);
        System.out.println("Course Name  : " + courseName);
        System.out.println("Duration : " + duration + " weeks");
        System.out.println("Fee : $" + fee);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Update the shared institute name
        Course.updateInstituteName("BridgeLabz Academy");

        // Create courses
        Course c1 = new Course("Java Programming", 12, 299.99);
        Course c2 = new Course("Web Development", 10, 249.99);

        System.out.println("\nCourse 1 Details:");
        c1.displayCourseDetails();

        System.out.println("\nCourse 2 Details:");
        c2.displayCourseDetails();
    }
}
