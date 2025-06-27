import java.util.ArrayList;

// Patient class
class Patient {
    private String name;
    private int id;
    private ArrayList<Doctor> consultedDoctors;

    public Patient(String name, int id) {
        this.name = name;
        this.id = id;
        this.consultedDoctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        consultedDoctors.add(doctor);
    }

    public String getName() {
        return name;
    }

    public void showConsultedDoctors() {
        System.out.println("Patient " + name + " has consulted with:");
        for (Doctor d : consultedDoctors) {
            System.out.println("- Dr. " + d.getName());
        }
    }
}

// Doctor class
class Doctor {
    private String name;
    private int id;
    private ArrayList<Patient> patients;

    public Doctor(String name, int id) {
        this.name = name;
        this.id = id;
        this.patients = new ArrayList<>();
    }

    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting patient " + patient.getName());
        patients.add(patient);
        patient.addDoctor(this);
    }

    public String getName() {
        return name;
    }

    public void showPatients() {
        System.out.println("Dr. " + name + " has consulted with:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}

// Hospital class
class Hospital {
    private String hospitalName;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showAllDoctors() {
        System.out.println("Doctors at " + hospitalName + ":");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.getName());
        }
    }

    public void showAllPatients() {
        System.out.println("Patients at " + hospitalName + ":");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}

// Main class
public class HospitalManagement {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor doc1 = new Doctor("Anjali Mehra", 101);
        Doctor doc2 = new Doctor("Ravi Verma", 102);

        Patient pat1 = new Patient("Ayush Raj", 201);
        Patient pat2 = new Patient("Divanshu Sharma", 202);

        hospital.addDoctor(doc1);
        hospital.addDoctor(doc2);

        hospital.addPatient(pat1);
        hospital.addPatient(pat2);

        // Consultations
        doc1.consult(pat1);
        doc1.consult(pat2);
        doc2.consult(pat1);

        // Display info
        System.out.println();
        doc1.showPatients();
        doc2.showPatients();

        System.out.println();
        pat1.showConsultedDoctors();
        pat2.showConsultedDoctors();

        System.out.println();
        hospital.showAllDoctors();
        hospital.showAllPatients();
    }
}
