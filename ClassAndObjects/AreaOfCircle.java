public class AreaOfCircle {
    static class Circle{
        double radius;


        public Circle(double radius){
            this.radius = radius;
        }

        public void displayArea(){
            double area = Math.PI * radius * radius; 
            System.out.println("The Area of radius "+this.radius+" is "+area);
        }
    }
    public static void main(String[] args) {
        Circle circle = new Circle(25);
        circle.displayArea();
    }
}
