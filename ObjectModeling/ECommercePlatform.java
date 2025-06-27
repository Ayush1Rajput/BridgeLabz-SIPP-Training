import java.util.ArrayList;

// Product class
class Product {
    private String name;
    private double price;
    private int productId;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }

    public void showProduct() {
        System.out.println("- " + name + " (₹" + price + ")");
    }
}

// Order class (aggregates Products)
class Order {
    int orderId;
    private ArrayList<Product> products;
    private Customer customer;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId + " placed by " + customer.getName());
        System.out.println("Products in this order:");
        for (Product p : products) {
            p.showProduct();
        }
        System.out.println("Total: ₹" + calculateTotal());
    }

    private double calculateTotal() {
        double sum = 0;
        for (Product p : products) {
            sum += p.getPrice();
        }
        return sum;
    }
}

// Customer class (places Orders)
class Customer {
    private int customerId;
    private String name;
    private ArrayList<Order> orders;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order ID: " + order.orderId);
    }

    public void showAllOrders() {
        System.out.println("Orders placed by " + name + ":");
        for (Order o : orders) {
            o.showOrderDetails();
            System.out.println();
        }
    }
}

// Main class
public class ECommercePlatform {
    public static void main(String[] args) {
        // Sample Products
        Product p1 = new Product(101, "Laptop", 55000);
        Product p2 = new Product(102, "Smartphone", 25000);
        Product p3 = new Product(103, "Headphones", 3000);

        // Customer
        Customer customer = new Customer(1, "Ayush Raj");

        // Create Order 1
        Order order1 = new Order(501, customer);
        order1.addProduct(p1);
        order1.addProduct(p3);

        // Customer places order1
        customer.placeOrder(order1);

        // Create Order 2
        Order order2 = new Order(502, customer);
        order2.addProduct(p2);

        // Customer places order2
        customer.placeOrder(order2);

        // Display all orders placed by the customer
        System.out.println();
        customer.showAllOrders();
    }
}
