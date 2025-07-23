package Collections.ListInterface;
import java.util.*;

public class RotateListElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of List : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number of positions to rotate : ");
        int positions = sc.nextInt();
        
        rotateList(arr, positions);
        
        sc.close();
    }

    private static void rotateList(int[] arr, int positions) {
    	
        positions = positions % arr.length;
        
        System.out.print("List before rotation : ");
        printArr(arr);

        int[] rotatedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rotatedArr[(i + arr.length - positions) % arr.length] = arr[i];
        }

        System.out.println("List after rotation : ");
        printArr(rotatedArr);
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
