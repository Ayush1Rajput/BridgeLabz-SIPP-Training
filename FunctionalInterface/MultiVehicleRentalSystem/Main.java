package FunctionalInterface.MultiVehicleRentalSystem;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Honda City");
        Vehicle bike = new Bike("Royal Enfield");
        Vehicle bus = new Bus("UP32-BX-1234");

        car.rent();
        bike.rent();
        bus.rent();

        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}
