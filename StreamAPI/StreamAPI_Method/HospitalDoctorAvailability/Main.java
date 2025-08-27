package StreamAPI.StreamAPI_Method.HospitalDoctorAvailability;

import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Sharma", "Cardiologist", true),
            new Doctor("Dr. Gupta", "Dermatologist", false),
            new Doctor("Dr. Mehta", "Neurologist", true),
            new Doctor("Dr. Singh", "Orthopedic", true)
        );

        System.out.println("Doctors available on weekends (sorted by specialty):");
        doctors.stream()
               .filter(d -> d.weekendAvailable)
               .sorted(Comparator.comparing(d -> d.specialty))
               .forEach(d -> System.out.println(d.name + " - " + d.specialty));
    }
}
