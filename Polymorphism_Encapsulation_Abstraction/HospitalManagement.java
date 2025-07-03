// Interface for medical records
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// Abstract Patient class
abstract class Patient implements MedicalRecord {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;
    private String[] medicalHistory;
    private int recordCount;

    public Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        this.medicalHistory = new String[5];
        this.recordCount = 0;
    }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Diagnosis: " + diagnosis);
    }

    public abstract double calculateBill();

    @Override
    public void addRecord(String record) {
        if (recordCount < medicalHistory.length) {
            medicalHistory[recordCount++] = record;
            System.out.println("Record added successfully.");
        } else {
            System.out.println("Record limit reached.");
        }
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:");
        for (int i = 0; i < recordCount; i++) {
            System.out.println("- " + medicalHistory[i]);
        }
    }

    public int getPatientId() {
        return patientId;
    }
}

// InPatient subclass
class InPatient extends Patient {
    private int daysAdmitted;
    private double roomChargePerDay;

    public InPatient(int patientId, String name, int age, String diagnosis, int daysAdmitted, double roomChargePerDay) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.roomChargePerDay = roomChargePerDay;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * roomChargePerDay;
    }
}

// OutPatient subclass
class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }
}

// Main class
public class HospitalManagement{
    public static void main(String[] args) {
        Patient[] patients = new Patient[5];
        int patientCount = 0;

        // Adding patients manually
        patients[patientCount++] = new InPatient(101, "Ayush", 22, "Appendicitis", 3, 2000.0);
        patients[patientCount++] = new OutPatient(102, "Divanshu", 24, "Flu", 500.0);

        // Adding records manually
        patients[0].addRecord("Admitted on 1st July");
        patients[0].addRecord("Appendix surgery");
        patients[1].addRecord("Visited for flu");
        patients[1].addRecord("Prescribed medication");

        // Display patient details and bills
        for (int i = 0; i < patientCount; i++) {
            System.out.println("\n--- Patient Details ---");
            patients[i].getPatientDetails();
            System.out.println("Total Bill: ₹" + patients[i].calculateBill());
            patients[i].viewRecords();
        }
    }
}
