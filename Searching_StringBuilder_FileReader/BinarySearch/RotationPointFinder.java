package Searching_StringBuilder_FileReader.BinarySearch;

import java.util.Scanner;

public class RotationPointFinder {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the length of Array : ");
    	int len = sc.nextInt();
    	System.out.println("Enter the elements of Array : ");
        int[] array = new int[len];
        for(int i=0;i<len;i++) {
        	array[i] = sc.nextInt();
        }        
        
        int rotationIndex = findRotationPoint(array);
        System.out.println("Rotation point index: " + rotationIndex);
        System.out.println("Smallest element: " + array[rotationIndex]);
        
        sc.close();
    }

    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
