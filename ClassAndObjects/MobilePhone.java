public class MobilePhone {
    // Attributes of the MobilePhone class
    String brand;
    String model;
    double price;

    // Constructor to initialize the attributes
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating objects of MobilePhone
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S21", 799.99);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 14", 999.00);

        // Displaying details of both phones
        System.out.println("Mobile Phone 1 Details:");
        phone1.displayDetails();

        System.out.println();
        
        System.out.println("Mobile Phone 2 Details:");
        phone2.displayDetails();
    }
}
