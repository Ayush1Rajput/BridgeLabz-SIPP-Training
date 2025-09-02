package Scenarios_Questions.SmartCityTransportServiceManagementSystem;

public interface TransportService {
	  String getServiceName();
	  double getFare();
	  String getDepartureTime();
	  String getRoute();
	  
	  default void printServiceDetails() {
	        System.out.println(getServiceName() + " - Fare: " + getFare() + ", Departure: " + getDepartureTime());
	  }
}
