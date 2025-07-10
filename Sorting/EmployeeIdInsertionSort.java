package Sorting;

import java.util.Scanner;

public class EmployeeIdInsertionSort{

    // Method to perform insertion sort
    public static void insertionSort(int[] employeeIds) {
        int n = employeeIds.length;

        for (int i = 1; i < n; i++) {
            int key = employeeIds[i]; // Current element to be inserted
            int j = i - 1;

            
            while (j >= 0 && employeeIds[j] > key) {
                employeeIds[j + 1] = employeeIds[j];
                j--;
            }

            // Insert the key at its correct location
            employeeIds[j + 1] = key;
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int id : array) {
            System.out.print(id + " ");
        }
        System.out.println();
    }

    // Main method to test the insertion sort
    public static void main(String[] args) {
    	// Scanner class
    	Scanner sc = new Scanner(System.in);
    	
		System.out.print("Enter he length of Array : ");
		int len = sc.nextInt();
		
		int []employeeIds = new int[len];
		
		System.out.println("Enter the Employee ID's : ");
		for(int i=0;i<len;i++) {
			employeeIds[i]=sc.nextInt();
		}

        System.out.println("Before Sorting:");
        printArray(employeeIds);

        insertionSort(employeeIds);

        System.out.println("After Sorting:");
        printArray(employeeIds);
        
        sc.close();  // close the scanner class
    }
}
