package FunctionalInterface.SmartDeviceControlInterface;

public class Main {
    public static void main(String[] args) {
        SmartDevice light = new Light("Bedroom");
        SmartDevice ac = new AC("Samsung");
        SmartDevice tv = new TV("Sony Bravia");

        light.turnOn();
        ac.turnOn();
        tv.turnOn();

        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}
