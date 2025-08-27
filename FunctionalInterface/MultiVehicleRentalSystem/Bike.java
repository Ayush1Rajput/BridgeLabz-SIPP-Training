package FunctionalInterface.MultiVehicleRentalSystem;

public class Bike implements Vehicle {
    private String bikeName;

    public Bike(String bikeName) {
        this.bikeName = bikeName;
    }

    public void rent() {
        System.out.println("Bike " + bikeName + " has been rented.");
    }

    public void returnVehicle() {
        System.out.println("Bike " + bikeName + " has been returned.");
    }
}