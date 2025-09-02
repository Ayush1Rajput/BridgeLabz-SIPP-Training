package com.workshops.smartCityTransportAndServiceManagement;

import java.util.*;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) {
        List<TransportService> services = Arrays.asList(
            new BusService("Central - Airport", 50),
            new MetroService("Central - Downtown"),
            new AmbulanceService()
        );

        services.stream()
            .filter(s -> s.getRoute().contains("Central"))
            .sorted(Comparator.comparing(TransportService::getPassengerCapacity).reversed())
            .forEach(s -> System.out.println("Option: " + s.serviceInfo() + ", Capacity: " + s.getPassengerCapacity()));

        FareCalculator calc = (base, peak, dist) -> base + TransportService.baseFarePerKm(dist) * (peak ? 1.5 : 1);
        double fare = calc.compute(30, true, 12);
        System.out.println("Booking fare: " + fare);

        System.out.println("\nLive Dashboard:");
        services.forEach(s -> System.out.println(s.getName() + " running on " + s.getRoute()));

        List<Trip> trips = Arrays.asList(
            new Trip("Central - Airport", 500, 40, true),
            new Trip("Central - Stand", 200, 20, false)
        );

        Map<String, Double> revenueByRoute = trips.stream()
            .collect(Collectors.groupingBy(Trip::getRoute, Collectors.summingDouble(Trip::getRevenue)));
        System.out.println("\nRevenue by Route: " + revenueByRoute);

        System.out.println("\nEmergency Prioritization:");
        services.stream().filter(s -> s instanceof EmergencyService)
            .forEach(s -> System.out.println(s.getName() + " has priority."));

        System.out.println("\nServices Overview:");
        services.forEach(s -> System.out.println(s.serviceInfo()));
    }
}
