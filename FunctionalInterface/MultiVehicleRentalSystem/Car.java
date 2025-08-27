package FunctionalInterface.MultiVehicleRentalSystem;

public class Car implements Vehicle {
    private String carName;

    public Car(String carName) {
        this.carName = carName;
    }

    public void rent() {
        System.out.println("Car " + carName + " has been rented.");
    }

    public void returnVehicle() {
        System.out.println("Car " + carName + " has been returned.");
    }
}
