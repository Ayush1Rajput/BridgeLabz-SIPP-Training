package Sorting;

import java.util.Scanner;

public class StudentsMarksBubbleSort {

	public static void main(String[] args) {
		// Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter he length of Array : ");
		int len = sc.nextInt();
		int []marks = new int[len];
		System.out.println("Enter the marks : ");
		for(int i=0;i<len;i++) {
			marks[i]=sc.nextInt();
		}
		
		bubbleSort(marks); // call the bubble sort method
		
		sc.close();
		
	}
	
	public static void bubbleSort(int[] array) {
		for(int i=0;i<array.length;i++) {
			boolean flag = true;  // use flag for check that array is sorted or not
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					// swap the elements in-place
					int temp = array[i];
					array[i]=array[j];
					array[j] = temp;
					flag = false;
				}
			}
			// if flag is true means array is sorted no need to iterate more time
			if(flag) {
				break;
			}
		}
		
		System.out.println();
		System.out.print("Marks in sorted way : ");
//		print marks by the help of foreach loop
		for(int x:array) {
			System.out.print(x+" ");
		}
	}

}
