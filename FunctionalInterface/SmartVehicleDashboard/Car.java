package FunctionalInterface.SmartVehicleDashboard;

public class Car implements VehicleDashboard {
    public void displaySpeed(int speed) {
        System.out.println("Car Speed: " + speed + " km/h");
    }
}