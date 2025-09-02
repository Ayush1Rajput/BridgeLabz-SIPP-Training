package com.workshops.smartCityTransportAndServiceManagement;

public class BusService implements TransportService {
    private final String route;
    private final int passengerCapacity;

    public BusService(String route, int capacity) {
        this.route = route;
        this.passengerCapacity = capacity;
    }

    @Override
    public String getName() { return "Bus"; }

    @Override
    public String getRoute() { return route; }

    @Override
    public double calculateFare(double baseFare, boolean peak, double distance) {
        double fare = baseFare + TransportService.baseFarePerKm(distance);
        if (peak) fare *= 1.2;
        return fare;
    }

    @Override
    public int getPassengerCapacity() { return passengerCapacity; }
}
