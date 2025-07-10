package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class ProductPriceQuickSort {
	
	public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }


	public static void main(String[] args) {
		// Scanner class
    	Scanner sc = new Scanner(System.in);
    	
		System.out.print("Enter he length of Array : ");
		int len = sc.nextInt();
		
		int []productPrice = new int[len];
		
		System.out.println("Enter the Product Price : ");
		for(int i=0;i<len;i++) {
			productPrice[i] = sc.nextInt();
		}
		

        quickSort(productPrice, 0, len - 1);
        
        System.out.print("Product price in sorted way : ");
        System.out.println(Arrays.toString(productPrice));

		
		sc.close();
	}

}
