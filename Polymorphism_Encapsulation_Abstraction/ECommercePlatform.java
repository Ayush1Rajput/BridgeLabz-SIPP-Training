import java.util.ArrayList;
import java.util.List;

// Abstract class Product
abstract class Product {
    private int productId;
    private String name;
    private double price;

    // Parameterized Constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getter methods (Encapsulation)
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Setter methods (Encapsulation)
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method to calculate discount
    abstract double calculateDiscount();

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("\n---- Product Details ----");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + calculateDiscount());
    }

    // Method to calculate the final price
    public double calculateFinalPrice() {
        double discount = calculateDiscount();
        double tax = calculateTax();
        return price + tax - discount;
    }

    // Default method for tax calculation
    public double calculateTax() {
        return 0.0;  // Default tax value 
    }

    // Default method for tax details 
    public void getTaxDetails() {
        System.out.println("No tax details available for this product.");
    }
}

// Electronics class extending Product and implementing Taxable
class Electronics extends Product implements Taxable {
    private double discountRate = 0.10; // 10% discount for electronics

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    // Tax calculation specific to electronics
    @Override
    public double calculateTax() {
        return getPrice() * 0.15; // 15% tax on electronics
    }

    // Tax details for electronics
    @Override
    public void getTaxDetails() {
        System.out.println("Tax for Electronics: 15%");
    }
}

// Clothing class extending Product and implementing Taxable
class Clothing extends Product implements Taxable {
    private double discountRate = 0.20; // 20% discount for clothing

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    // Tax calculation specific to clothing
    @Override
    public double calculateTax() {
        return getPrice() * 0.12; // 12% tax on clothing
    }

    // Tax details for clothing
    @Override
    public void getTaxDetails() {
        System.out.println("Tax for Clothing: 12%");
    }
}

// Groceries class extending Product (not implementing Taxable)
class Groceries extends Product {
    private double discountRate = 0.05; // 5% discount for groceries

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    // Groceries have no tax applied
    @Override
    public double calculateTax() {
        return 0.0; // No tax on groceries
    }

    @Override
    public void getTaxDetails() {
        System.out.println("No tax applicable for Groceries.");
    }
}

// Taxable interface
interface Taxable {
    double calculateTax();
    void getTaxDetails();
}

// ECommercePlatform class
public class ECommercePlatform {

    public static void main(String[] args) {
        // Create list of products
        List<Product> products = new ArrayList<>();

        // Adding products
        products.add(new Electronics(101, "Laptop", 50000));
        products.add(new Clothing(102, "T-Shirt", 1000));
        products.add(new Groceries(103, "Rice", 200));

        // Calculate and display final price for each product
        for (Product product : products) {
            product.displayProductDetails();
            double finalPrice = product.calculateFinalPrice();
            System.out.println("Final Price (after tax and discount): " + finalPrice);
            System.out.println();
        }
    }
}
