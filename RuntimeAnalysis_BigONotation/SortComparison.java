package RuntimeAnalysis_BigONotation;

import java.util.Arrays;
import java.util.Random;

public class SortComparison {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};

        for (int size : sizes) {
            System.out.println("Dataset Size: " + size);

            int[] original = generateRandomArray(size);

            int[] bubble = Arrays.copyOf(original, original.length);
            if (size <= 10000) {
                long start = System.nanoTime();
                bubbleSort(bubble);
                long end = System.nanoTime();
                System.out.printf("Bubble Sort Time: %.4f ms\n", (end - start) / 1_000_000.0);
            } else {
                System.out.println("Bubble Sort Time: Unfeasible (>1hr)");
            }

            int[] merge = Arrays.copyOf(original, original.length);
            long mergeStart = System.nanoTime();
            mergeSort(merge, 0, merge.length - 1);
            long mergeEnd = System.nanoTime();
            System.out.printf("Merge Sort Time: %.4f ms\n", (mergeEnd - mergeStart) / 1_000_000.0);

            int[] quick = Arrays.copyOf(original, original.length);
            long quickStart = System.nanoTime();
            quickSort(quick, 0, quick.length - 1);
            long quickEnd = System.nanoTime();
            System.out.printf("Quick Sort Time: %.4f ms\n", (quickEnd - quickStart) / 1_000_000.0);

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

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] leftArray = Arrays.copyOfRange(arr, left, mid + 1);
        int[] rightArray = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }
        while (i < leftArray.length) arr[k++] = leftArray[i++];
        while (j < rightArray.length) arr[k++] = rightArray[j++];
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }
        int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;
        return i + 1;
    }
}
