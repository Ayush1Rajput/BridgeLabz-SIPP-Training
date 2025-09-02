package com.workshops.smartCityTransportAndServiceManagement;

public interface TransportService {
    String getName();
    String getRoute();
    double calculateFare(double baseFare, boolean peak, double distance);
    int getPassengerCapacity();

    default String serviceInfo() {
        return getName() + " on route " + getRoute();
    }

    static double baseFarePerKm(double distance) {
        return distance * 5.0;
    }
}
