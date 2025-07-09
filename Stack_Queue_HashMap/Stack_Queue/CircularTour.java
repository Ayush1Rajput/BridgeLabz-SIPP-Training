package Stack_Queue_HashMap.Stack_Queue;

import java.util.Scanner;

public class CircularTour {

    public int findStartingPoint(int[] petrol, int[] distance) {
        int totalPetrol = 0;
        int totalDistance = 0;
        int start = 0;
        int currentPetrol = 0;

        for (int i = 0; i < petrol.length; i++) {
            totalPetrol += petrol[i];
            totalDistance += distance[i];
        }

        if (totalPetrol < totalDistance) {
            return -1; // Tour is not possible
        }

        for (int i = 0; i < petrol.length; i++) {
            currentPetrol += petrol[i] - distance[i];

            if (currentPetrol < 0) {
                start = i + 1;
                currentPetrol = 0;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CircularTour tour = new CircularTour();

        System.out.print("Enter number of petrol pumps: ");
        int n = scanner.nextInt();

        int[] petrol = new int[n];
        int[] distance = new int[n];

        System.out.println("Enter petrol and distance for each pump:");
        for (int i = 0; i < n; i++) {
            System.out.print("Pump " + (i + 1) + " petrol: ");
            petrol[i] = scanner.nextInt();
            System.out.print("Pump " + (i + 1) + " distance to next: ");
            distance[i] = scanner.nextInt();
        }

        int startIndex = tour.findStartingPoint(petrol, distance);

        if (startIndex == -1) {
            System.out.println("Circular tour is not possible from any pump.");
        } else {
            System.out.println("Start the tour from pump index: " + startIndex);
        }

        scanner.close();
    }
}
