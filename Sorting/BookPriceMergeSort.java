package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BookPriceMergeSort {

	public static void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
            int mid = left + (right - left) / 2;

            // Here we call mergeSort recursively
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
          
            merge(arr, left, mid, right);
        }

		
	}
	
	private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }
        while (i < n1) arr[k++] = leftArr[i++];
        while (j < n2) arr[k++] = rightArr[j++];
    }

	
	public static void main(String[] args) {
		
		// Scanner class
    	Scanner sc = new Scanner(System.in);
    	
		System.out.print("Enter he length of Array : ");
		int len = sc.nextInt();
		
		int []bookPrice = new int[len];
		
		System.out.println("Enter the Book Price : ");
		for(int i=0;i<len;i++) {
			bookPrice[i] = sc.nextInt();
		}
		
		mergeSort(bookPrice, 0, len-1);
		
		System.out.print("Books Price in sorted : ");
        System.out.println(Arrays.toString(bookPrice));

		
		sc.close(); // close the scanner class

	}

}
