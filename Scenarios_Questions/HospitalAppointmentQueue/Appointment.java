package Scenarios_Questions.HospitalAppointmentQueue;

public class Appointment {
	 private String patientName;
	    private String doctorName;
	    private String timeSlot;

	    public Appointment(String patientName, String doctorName, String timeSlot) {
	        this.patientName = patientName;
	        this.doctorName = doctorName;
	        this.timeSlot = timeSlot;
	    }

	    public String getPatientName() {
	        return patientName;
	    }

	    public String getDoctorName() {
	        return doctorName;
	    }

	    public String getTimeSlot() {
	        return timeSlot;
	    }

	    
	    @Override
	    public String toString() {
	        return "Appointment{" +
	                "patientName='" + patientName + '\'' +
	                ", doctorName='" + doctorName + '\'' +
	                ", timeSlot='" + timeSlot + '\'' +
	                '}';
	    }

}
