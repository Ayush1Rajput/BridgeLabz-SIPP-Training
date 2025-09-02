package Scenarios_Questions.SmartCityTransportServiceManagementSystem;

public class MetroService implements TransportService{
	private String name = "Metro Express";
    private double fare = 3.5;
    private String departureTime = "08:30";
    private String route = "B";
    
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
