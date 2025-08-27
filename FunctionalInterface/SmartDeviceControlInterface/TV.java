package FunctionalInterface.SmartDeviceControlInterface;

public class TV implements SmartDevice {
    private String model;

    public TV(String model) {
        this.model = model;
    }

    public void turnOn() {
        System.out.println("TV " + model + " is now ON.");
    }

    public void turnOff() {
        System.out.println("TV " + model + " is now OFF.");
    }
}
