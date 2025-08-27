package FunctionalInterface.MultiVehicleRentalSystem;

public class Bus implements Vehicle {
    private String busNumber;

    public Bus(String busNumber) {
        this.busNumber = busNumber;
    }

    public void rent() {
        System.out.println("Bus " + busNumber + " has been rented.");
    }

    public void returnVehicle() {
        System.out.println("Bus " + busNumber + " has been returned.");
    }
}