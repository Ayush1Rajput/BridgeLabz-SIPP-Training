package Scenarios_Questions.SmartCityTransportServiceManagementSystem;

public class TaxiService implements TransportService {
	
	private String name = "City Taxi";
    private double fare = 15.0;
    private String departureTime = "Now";
    private String route = "Point to Point";
    
    public String getServiceName() {
    	return name; 
    	}
    
    public double getFare() { 
    	return fare; 
    	}
    
    public String getDepartureTime() {
    	return departureTime;
    	}
    
    public String getRoute() { 
    	return route;
    	}
}
