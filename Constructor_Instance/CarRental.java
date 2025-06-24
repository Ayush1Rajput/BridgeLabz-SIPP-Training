public class CarRental {
    // Attributes
    private String customerName;
    private String carModel;
    private int rentalDays;

    // Constant rental rate per day
    private static final double DAILY_RATE = 50.0;

    // Default constructor
    public CarRental() {
        this.customerName = "";
        this.carModel = "";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total rental cost
    public double calculateTotalCost() {
        return DAILY_RATE * rentalDays;
    }

    // Method to display rental details
    public void displayInfo() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model : " + carModel);
        System.out.println("Rental Days : " + rentalDays);
        System.out.println("Total Cost : $" + calculateTotalCost());
    }

    // Main method to demonstrate usage
    public static void main(String[] args) {
        // Using default constructor
        CarRental defaultRental = new CarRental();
        System.out.println("Default Rental:");
        defaultRental.displayInfo();

        System.out.println();

        // Using parameterized constructor
        CarRental customRental = new CarRental("Karan", "Honda Civic", 4);
        System.out.println("Custom Rental:");
        customRental.displayInfo();
    }
}
