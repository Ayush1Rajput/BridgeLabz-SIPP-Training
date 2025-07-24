package Collections.QueueInterface;
import java.util.*;

class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class HospitalTriageSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Patient> triageQueue = new PriorityQueue<>(new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                return p2.severity - p1.severity; // Higher severity comes first
            }
        });

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of patient " + (i + 1) + ": ");
            String name = sc.nextLine();
            System.out.print("Enter severity of " + name + " (1-10): ");
            int severity = sc.nextInt();
            sc.nextLine(); 
            triageQueue.add(new Patient(name, severity));
        }

        System.out.println("\nTreatment order (highest severity first):");
        while (!triageQueue.isEmpty()) {
            System.out.println(triageQueue.remove());
        }
        
        sc.close();
    }
}
