package RuntimeAnalysis_BigONotation;

import java.util.Arrays;
import java.util.Random;

public class SearchComparison {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        int target = -1; // use a value that likely doesn't exist to simulate worst-case

        for (int size : sizes) {
            int[] data = generateRandomArray(size);

            long linearStart = System.nanoTime();
            linearSearch(data, target);
            long linearEnd = System.nanoTime();
            double linearTime = (linearEnd - linearStart) / 1_000_000.0;

            Arrays.sort(data);
            long binaryStart = System.nanoTime();
            binarySearch(data, target);
            long binaryEnd = System.nanoTime();
            double binaryTime = (binaryEnd - binaryStart) / 1_000_000.0;

            System.out.println("Dataset Size: " + size);
            System.out.printf("Linear Search Time: %.4f ms\n", linearTime);
            System.out.printf("Binary Search Time: %.4f ms\n", binaryTime);
            System.out.println();
        }
    }

    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(size * 10);
        }
        return arr;
    }

    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }

    public static boolean binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return true;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}
