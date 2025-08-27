package FunctionalInterface.SmartVehicleDashboard;

public class ElectricCar implements VehicleDashboard {
    public void displaySpeed(int speed) {
        System.out.println("Electric Car Speed: " + speed + " km/h");
    }

}