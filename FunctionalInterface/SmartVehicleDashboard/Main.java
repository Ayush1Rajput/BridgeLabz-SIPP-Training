package FunctionalInterface.SmartVehicleDashboard;

public class Main {
	public static void main(String[] args) {
        VehicleDashboard car = new Car();
        car.displaySpeed(80);

        VehicleDashboard eCar = new ElectricCar();
        eCar.displaySpeed(100);
        eCar.showBatteryStatus(85);
    }
}
