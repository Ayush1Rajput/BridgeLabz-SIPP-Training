public class Vehicle {
    private static double registrationFee = 100.0;
    private final String registrationNumber;

    // Instance variables for vehicle details
    private String ownerName;
    private String vehicleType;

    // Constructor 
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        if (newFee >= 0) {
            registrationFee = newFee;
            System.out.println("Updated registration fee to " + registrationFee);
        } else {
            System.out.println("Invalid fee. Please enter a positive value.");
        }
    }

    // Method to display vehicle registration details
    public void displayVehicleDetails() {
        System.out.println("\nOwner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Static method to check if an object is an instance of Vehicle
    public static void displayRegistrationDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle vehicle = (Vehicle) obj;
            vehicle.displayVehicleDetails();
        } else {
            System.out.println("This object is not a Vehicle.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create vehicle objects
        Vehicle vehicle1 = new Vehicle("Karan", "Car", "V12345");
        Vehicle vehicle2 = new Vehicle("Prakash", "Motorcycle", "V12356");

        // Display vehicle details using instanceof check
        displayRegistrationDetails(vehicle1);
        System.out.println();
        displayRegistrationDetails(vehicle2);
        System.out.println();

        // Update the registration fee for all vehicles
        updateRegistrationFee(150.0);

        // Display vehicle details again after the fee change
        displayRegistrationDetails(vehicle1);
        System.out.println();
        displayRegistrationDetails(vehicle2);
        System.out.println();

        // Try to display registration details of a non-Vehicle object
        String nonVehicleObject = "Not a Vehicle";
        displayRegistrationDetails(nonVehicleObject);  // Will show that it's not a Vehicle
    }
}
