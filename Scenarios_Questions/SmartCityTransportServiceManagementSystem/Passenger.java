package Scenarios_Questions.SmartCityTransportServiceManagementSystem;

public class Passenger {
	private String name;
	private String route;
	private double fare;
	
	public Passenger(String name, String route, double fare) {
		this.name = name;
		this.route = route;
		this.fare = fare;
	}
	
	public String getRoute() {
		return route;
	}
	
	public double getFare() {
		return fare;
	}
}
