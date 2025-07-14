package Searching_StringBuilder_FileReader.BinarySearch;

import java.util.Scanner;

public class PeakElementFinder {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the length of Array : ");
    	int len = sc.nextInt();
    	System.out.println("Enter the elements of Array : ");
        int[] array = new int[len];
        for(int i=0;i<len;i++) {
        	array[i] = sc.nextInt();
        }        
        
    	
        int peakIndex = findPeakElement(array);
        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element value: " + array[peakIndex]);
        
        sc.close();
    }

    public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            boolean leftCheck = (mid == 0 || arr[mid] >= arr[mid - 1]);
            boolean rightCheck = (mid == arr.length - 1 || arr[mid] >= arr[mid + 1]);

            if (leftCheck && rightCheck) {
                return mid;
            } else if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
