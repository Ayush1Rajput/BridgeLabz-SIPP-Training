package Scenario_Based_Question.AgroBotSystem;

//Interface to simulate external sensor input
interface SensorReadable {
 void readSensorData();
}

//Abstract base class for all irrigation units
abstract class IrrigationUnit implements SensorReadable {
 protected String unitName;
 private boolean calibrated;

 // Constructor chaining
 public IrrigationUnit(String unitName) {
     this.unitName = unitName;
     this.calibrated = false;
     calibrate();
 }

 // Private method - internal logic, not accessible outside
 private void calibrate() {
     System.out.println(unitName + " is being calibrated...");
     this.calibrated = true;
 }

 // Public method to check calibration status
 public boolean isCalibrated() {
     return calibrated;
 }

 // Abstract method to be overridden by specialized units
 public abstract void startWatering();
}

//Sprinkler system that extends base unit
class Sprinkler extends IrrigationUnit {

 public Sprinkler(String unitName) {
     super(unitName);
 }

 @Override
 public void startWatering() {
     System.out.println(unitName + " (Sprinkler) is spraying water in circular motion.");
 }

 @Override
 public void readSensorData() {
     System.out.println(unitName + " is reading temperature and humidity sensors.");
 }
}

//Drip system that extends base unit
class DripSystem extends IrrigationUnit {

 public DripSystem(String unitName) {
     super(unitName);
 }

 @Override
 public void startWatering() {
     System.out.println(unitName + " (DripSystem) is slowly releasing water to the roots.");
 }

 @Override
 public void readSensorData() {
     System.out.println(unitName + " is checking soil moisture sensors.");
 }
}

//Main class to test the system
public class AgroBotSystem {
 public static void main(String[] args) {
     // Create Sprinkler Unit
     Sprinkler sprinklerUnit = new Sprinkler("Sprinkler-A1");
     sprinklerUnit.readSensorData();
     sprinklerUnit.startWatering();
     System.out.println("Calibrated: " + sprinklerUnit.isCalibrated());

     System.out.println();

     // Create Drip System Unit
     DripSystem dripUnit = new DripSystem("DripSystem-B2");
     dripUnit.readSensorData();
     dripUnit.startWatering();
     System.out.println("Calibrated: " + dripUnit.isCalibrated());
 }
}
