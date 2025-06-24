public class AreaOfCircle {

    // Class defination
    static class Circle{
        // Class attributes
        double radius;

        // Constructer for Circle 
        public Circle(double radius){
            this.radius = radius;
        }

        // Method to display the Area of circle
        public void displayArea(){
            double area = Math.PI * radius * radius; 
            System.out.println("The Area of radius "+this.radius+" is "+area);
        }
    }
    public static void main(String[] args) {
        // Creating the object of Circle
        Circle circle = new Circle(25);
        circle.displayArea();
    }
}
