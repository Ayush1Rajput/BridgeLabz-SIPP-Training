package com.workshops.smartCityTransportAndServiceManagement;

@FunctionalInterface
public interface FareCalculator {
    double compute(double baseFare, boolean peak, double distance);
}
