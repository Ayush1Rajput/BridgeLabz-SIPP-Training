package Searching_StringBuilder_FileReader.BinarySearch;

import java.util.Scanner;

public class FirstLastOccurrence {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the length of Array : ");
    	int len = sc.nextInt();
    	System.out.println("Enter the elements of Array : ");
        int[] array = new int[len];
        for(int i=0;i<len;i++) {
        	array[i] = sc.nextInt();
        }        
        
        System.out.print("Enter the target value : ");
        int target = sc.nextInt();
        
    	
        int[] result = findFirstAndLastOccurrence(array, target);
        System.out.println("First occurrence: " + result[0]);
        System.out.println("Last occurrence: " + result[1]);
        sc.close();
    }

    public static int[] findFirstAndLastOccurrence(int[] arr, int target) {
        int first = findOccurrence(arr, target, true);
        int last = findOccurrence(arr, target, false);
        return new int[] {first, last};
    }

    private static int findOccurrence(int[] arr, int target, boolean findFirst) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                result = mid;
                if (findFirst) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
