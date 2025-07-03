// Interface for GPS functionality
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Abstract class Vehicle
abstract class Vehicle implements GPS {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicle(String vehicleId, String driverName, double ratePerKm, String location) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = location;
    }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: ₹" + ratePerKm);
        System.out.println("Current Location: " + currentLocation);
    }

    public abstract double calculateFare(double distance);

    public String getVehicleId() {
        return vehicleId;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
        System.out.println("Location updated to: " + newLocation);
    }
}

// Subclass: Car
class Car extends Vehicle {
    public Car(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 1.5 * 1.0; // Car rate multiplier
    }
}

// Subclass: Bike
class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 0.8 * 1.0; // Bike rate multiplier
    }
}

// Subclass: Auto
class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 1.2 * 1.0; // Auto rate multiplier
    }
}

// Main class
public class RideHailingApp {
    public static void main(String[] args) {
        // Fixed-size array of vehicles
        Vehicle[] vehicles = new Vehicle[3];

        // Adding vehicles manually
        vehicles[0] = new Car("C101", "Ayush", 10.0, "Mathura");
        vehicles[1] = new Bike("B202", "Divanshu", 5.0, "Agra");
        vehicles[2] = new Auto("A303", "Rahul", 7.0, "Delhi");

        // Display all vehicles
        for (Vehicle v : vehicles) {
            System.out.println("\n--- Vehicle Details ---");
            v.getVehicleDetails();
        }

        // Calculate fare for each vehicle (example distance: 10 km)
        double sampleDistance = 10.0;
        for (Vehicle v : vehicles) {
            System.out.println("\nCalculating fare for Vehicle ID: " + v.getVehicleId());
            double fare = v.calculateFare(sampleDistance);
            System.out.println("Distance: " + sampleDistance + " km");
            System.out.println("Fare: ₹" + fare);
        }

        // Update location for one vehicle
        System.out.println("\nUpdating location for Vehicle ID: " + vehicles[0].getVehicleId());
        vehicles[0].updateLocation("Noida");

        // View updated details
        System.out.println("\n--- Updated Vehicle Info ---");
        vehicles[0].getVehicleDetails();
    }
}
