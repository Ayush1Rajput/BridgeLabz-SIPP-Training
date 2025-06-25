public class Patient {
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    private final String patientID;

    private String name;
    private int age;
    private String ailment;

    // Constructor t
    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        
        totalPatients++; // Increment the total number of patients 
    }

    // Static method to get total number of patients admitted
    public static void getTotalPatients() {
        System.out.println("\nTotal patients admitted to " + hospitalName + ": " + totalPatients);
    }

    // Method to display patient details
    public void displayPatientDetails() {
        System.out.println("\nPatient Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("Patient ID: " + patientID);
    }

    // Static method to display patient details only if the object is an instance of Patient
    public static void displayPatientInfo(Object obj) {
        if (obj instanceof Patient) {
            Patient patient = (Patient) obj;
            patient.displayPatientDetails();
        } else {
            System.out.println("Object is not a Patient.");
        }
    }

    public static void main(String[] args) {
        // Create Patient objects
        Patient patient1 = new Patient("Navdeep", 35, "Flu", "P1001");
        Patient patient2 = new Patient("Utkarsh", 60, "Pneumonia", "P1002");

        // Display patient details
        displayPatientInfo(patient1);
        displayPatientInfo(patient2);

        // Get the total number of patients
        getTotalPatients();

        // Create an object that is not a Patient
        String notAPatient = "Not a patient object";
        displayPatientInfo(notAPatient);  
    }
}
