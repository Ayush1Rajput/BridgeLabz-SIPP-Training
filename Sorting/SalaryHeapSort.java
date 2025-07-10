package Sorting;

import java.util.Scanner;

public class SalaryHeapSort {

	public static void heapSort(int[] salaries) {
        int n = salaries.length;

        // Step 1: Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Step 2: Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root (largest) to end
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Re-heapify the reduced heap
            heapify(salaries, i, 0);
        }
    }

    // Heapify subtree rooted at index i
    // n is the size of heap
    private static void heapify(int[] arr, int n, int i) {
        int largest = i;          // Initialize largest as root
        int left = 2 * i + 1;     // left child
        int right = 2 * i + 2;    // right child

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int salary : arr) {
            System.out.print(salary + " ");
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
    	
    	// Scanner class
    	Scanner sc = new Scanner(System.in);
    	
		System.out.print("Enter he length of Array : ");
		int len = sc.nextInt();
		
		int []salaryDemands= new int[len];
		
		System.out.println("Enter the Salary: ");
		for(int i=0;i<len;i++) {
			salaryDemands[i] = sc.nextInt();
		}
		

        System.out.println("Before Sorting (Salary Demands):");
        printArray(salaryDemands);

        heapSort(salaryDemands);

        System.out.println("After Sorting (Ascending Salary Demands):");
        printArray(salaryDemands);
        
        sc.close();
    }

}
