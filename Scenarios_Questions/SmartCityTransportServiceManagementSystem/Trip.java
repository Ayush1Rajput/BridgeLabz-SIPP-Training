package com.workshops.smartCityTransportAndServiceManagement;

public class Trip {
    private final String route;
    private final double revenue;
    private final int passengers;
    private final boolean peak;

    public Trip(String route, double revenue, int passengers, boolean peak) {
        this.route = route;
        this.revenue = revenue;
        this.passengers = passengers;
        this.peak = peak;
    }

    public String getRoute() { return route; }
    public double getRevenue() { return revenue; }
    public int getPassengers() { return passengers; }
    public boolean isPeak() { return peak; }
}
