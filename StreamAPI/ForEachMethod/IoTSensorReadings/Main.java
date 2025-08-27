package StreamAPI.ForEachMethod.IoTSensorReadings;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> readings = Arrays.asList(45, 72, 55, 90, 30, 65);
        int threshold = 60;

        System.out.println("IoT Sensor Readings above threshold (" + threshold + "):");
        readings.stream()
                .filter(value -> value > threshold)
                .forEach(value -> System.out.println("Reading: " + value));
    }
}