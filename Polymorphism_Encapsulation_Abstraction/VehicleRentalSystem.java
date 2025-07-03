import java.util.ArrayList;

// Abstract class Vehicle
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Parameterized Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getter and Setter methods (Encapsulation)
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    // Abstract method to calculate rental cost
    abstract double calculateRentalCost(int days);

    // Method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("\n---- Vehicle Details ----");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + type);
        System.out.println("Rental Rate per day: " + rentalRate);
    }
}

// Car class extending Vehicle and implementing Insurable
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    // Constructor
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    // Insurance calculation specific to cars
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15; // 15% of rental rate for insurance
    }

    // Insurance details for cars
    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy Number: " + insurancePolicyNumber);
        System.out.println("Insurance for Car: 15% of the rental rate.");
    }
}

// Bike class extending Vehicle and implementing Insurable
class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    // Constructor
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    // Insurance calculation specific to bikes
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.10; // 10% of rental rate for insurance
    }

    // Insurance details for bikes
    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy Number: " + insurancePolicyNumber);
        System.out.println("Insurance for Bike: 10% of the rental rate.");
    }
}

// Truck class extending Vehicle and implementing Insurable
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    // Constructor
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    // Insurance calculation specific to trucks
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.20; // 20% of rental rate for insurance
    }

    // Insurance details for trucks
    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy Number: " + insurancePolicyNumber);
        System.out.println("Insurance for Truck: 20% of the rental rate.");
    }
}

// Insurable interface
interface Insurable {
    double calculateInsurance();
    void getInsuranceDetails();
}

// VehicleRentalSystem class
public class VehicleRentalSystem {

    public static void main(String[] args) {
        // Create list of vehicles
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        // Adding vehicles
        vehicles.add(new Car("CAR123", 1500, "INS12345"));
        vehicles.add(new Bike("BIKE567", 500, "INS67890"));
        vehicles.add(new Truck("TRUCK910", 2500, "INS11223"));

        // Iterate over vehicles and calculate rental and insurance costs
        for (Vehicle vehicle : vehicles) {
            vehicle.displayVehicleDetails();
            System.out.print("Rental Cost for 5 days: ");
            double rentalCost = vehicle.calculateRentalCost(5);
            System.out.println(rentalCost);
            
            if (vehicle instanceof Insurable) {
                Insurable insurableVehicle = (Insurable) vehicle;
                insurableVehicle.getInsuranceDetails();
                double insuranceCost = insurableVehicle.calculateInsurance();
                System.out.println("Insurance Cost: " + insuranceCost);
            }
            System.out.println();
        }
    }
}
