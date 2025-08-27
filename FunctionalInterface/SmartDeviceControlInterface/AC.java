package FunctionalInterface.SmartDeviceControlInterface;

public class AC implements SmartDevice {
    private String brand;

    public AC(String brand) {
        this.brand = brand;
    }

    public void turnOn() {
        System.out.println(brand + " AC is now ON.");
    }

    public void turnOff() {
        System.out.println(brand + " AC is now OFF.");
    }
}