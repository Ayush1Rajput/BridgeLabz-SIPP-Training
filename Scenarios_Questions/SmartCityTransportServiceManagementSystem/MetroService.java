package com.workshops.smartCityTransportAndServiceManagement;

public class MetroService implements TransportService {
    private final String route;

    public MetroService(String route) {
        this.route = route;
    }

    @Override
    public String getName() { return "Metro"; }

    @Override
    public String getRoute() { return route; }

    @Override
    public double calculateFare(double baseFare, boolean peak, double distance) {
        return baseFare + (distance * 3);
    }

    @Override
    public int getPassengerCapacity() { return 1000; }
}
