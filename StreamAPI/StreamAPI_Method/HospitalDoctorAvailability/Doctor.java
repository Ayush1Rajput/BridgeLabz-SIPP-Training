package StreamAPI.StreamAPI_Method.HospitalDoctorAvailability;

public class Doctor {
	String name;
    String specialty;
    boolean weekendAvailable;

    public Doctor(String name, String specialty, boolean weekendAvailable) {
        this.name = name;
        this.specialty = specialty;
        this.weekendAvailable = weekendAvailable;
    }
}
