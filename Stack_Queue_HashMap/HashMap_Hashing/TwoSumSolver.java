package Stack_Queue_HashMap.HashMap_Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSumSolver {

    public void findTwoSumIndices(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // value → index

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                System.out.println("Indices found: " + map.get(complement) + " and " + i);
                System.out.println("Values: " + complement + " + " + arr[i] + " = " + target);
                return;
            }

            map.put(arr[i], i);
        }

        System.out.println("No pair found with the given target sum.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TwoSumSolver solver = new TwoSumSolver();

        System.out.print("Enter number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = scanner.nextInt();

        solver.findTwoSumIndices(arr, target);

        scanner.close();
    }
}
