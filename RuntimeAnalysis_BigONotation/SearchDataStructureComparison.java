package RuntimeAnalysis_BigONotation;

import java.util.*;

public class SearchDataStructureComparison {
    public static void main(String[] args) {
        int[] sizes = {1_000, 100_000, 1_000_000};
        int target = -1; // unlikely to be present (worst-case scenario)

        for (int size : sizes) {
            System.out.println("Dataset Size: " + size);

            // Generate data
            int[] array = generateData(size);
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();

            for (int val : array) {
                hashSet.add(val);
                treeSet.add(val);
            }

            // Array search
            long startArray = System.nanoTime();
            boolean foundInArray = linearSearch(array, target);
            long endArray = System.nanoTime();
            System.out.printf("  Array Search Time: %.4f ms\n", (endArray - startArray) / 1_000_000.0);

            // HashSet search
            long startHash = System.nanoTime();
            boolean foundInHashSet = hashSet.contains(target);
            long endHash = System.nanoTime();
            System.out.printf("  HashSet Search Time: %.4f ms\n", (endHash - startHash) / 1_000_000.0);

            // TreeSet search
            long startTree = System.nanoTime();
            boolean foundInTreeSet = treeSet.contains(target);
            long endTree = System.nanoTime();
            System.out.printf("  TreeSet Search Time: %.4f ms\n\n", (endTree - startTree) / 1_000_000.0);
        }
    }

    public static int[] generateData(int size) {
        Random rand = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = rand.nextInt(size * 10);
        }
        return data;
    }

    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }
}
