package FunctionalInterface.SmartDeviceControlInterface;

public class Light implements SmartDevice {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println(name + " Light is now ON.");
    }

    public void turnOff() {
        System.out.println(name + " Light is now OFF.");
    }
}