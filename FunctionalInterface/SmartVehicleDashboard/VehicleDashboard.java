package FunctionalInterface.SmartVehicleDashboard;

public interface VehicleDashboard {
    void displaySpeed(int speed);

    default void showBatteryStatus(int batteryPercentage) {
        System.out.println("Battery Status: " + batteryPercentage + "%");
    }
}
