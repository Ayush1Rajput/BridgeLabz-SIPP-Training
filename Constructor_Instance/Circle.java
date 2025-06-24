public class Circle {
    // Attribute
    private double radius;

    // Default constructor 
    public Circle() {
        this.radius = 0.0; // Default radius value
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to display circle info
    public void displayInfo() {
        System.out.println("Radius: " + radius);
        System.out.println("Area : " + calculateArea());
    }

    // Main method for demonstration
    public static void main(String[] args) {
        // Using default constructor
        Circle defaultCircle = new Circle();
        defaultCircle.displayInfo();

        System.out.println();

        // Using parameterized constructor
        Circle customCircle = new Circle(4.5);
        customCircle.displayInfo();
    }
}
