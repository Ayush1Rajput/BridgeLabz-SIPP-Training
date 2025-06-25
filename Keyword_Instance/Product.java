public class Product {
    private static double discount = 0.0;
    private static int idCounter = 1000;
    private final int productID;

    // Instance variables
    private String productName;
    private double price;
    private int quantity;

    // Parameterized Constructor using 'this'
    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = ++idCounter;
    }

    // Static method to update discount
    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0 && newDiscount <= 100) {
            discount = newDiscount;
        } else {
            System.out.println("Invalid discount value. Must be between 0 and 100.");
        }
    }

    // Method to get price after discount
    public double getDiscountedPrice() {
        return price - (price * discount / 100);
    }

    // Method to display product details if it's an instance of Product
    public static void displayProductDetails(Object obj) {
        if (obj instanceof Product) {
            Product p = (Product) obj;
            System.out.println("Product ID: " + p.productID);
            System.out.println("Name: " + p.productName);
            System.out.println("Price: " + p.price);
            System.out.println("Quantity: " + p.quantity);
            System.out.println("Discounted Price: " + p.getDiscountedPrice());
        } else {
            System.out.println("Object is not a Product.");
        }
    }


    public static void main(String[] args) {
        Product.updateDiscount(10); // Set 10% discount

        Product prod1 = new Product("Laptop", 1200.00, 1);
        Product prod2 = new Product("Mouse", 25.00, 2);

        Product.displayProductDetails(prod1);
        System.out.println();
        Product.displayProductDetails(prod2);
        System.out.println();

    }
}
