package com.workshops.smartCityTransportAndServiceManagement;

public class AmbulanceService implements TransportService, EmergencyService {
    @Override
    public String getName() { return "Ambulance"; }

    @Override
    public String getRoute() { return "Emergency Route"; }

    @Override
    public double calculateFare(double baseFare, boolean peak, double distance) {
        return 0;
    }

    @Override
    public int getPassengerCapacity() { return 2; }
}
