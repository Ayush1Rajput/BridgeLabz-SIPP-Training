public class Circle {
    
    private double radius;

    // Default Constructor
    public Circle(){
        this.radius = 1.0;
    }

    // Parameterized Constructor
    public Circle(double radius){
        this.radius = radius;
    }

    // Method for calculating the area
    public double getArea(){
        return Math.PI * radius*radius;
    }

    // Method for display the Infromation
    public void displayDetails(){
        System.out.println();
        System.out.println("Radius of Circle is : " + radius);
        System.out.println("Area of Circle is : " + getArea());
        System.out.println();
    }


    public static void main(String[] args) {

        // Call the default constructor
        Circle circle = new Circle();
        circle.displayDetails();

        // Call the Parameterized Constructor
        Circle circle2 = new Circle(12.0);
        circle2.displayDetails();
    }
}

