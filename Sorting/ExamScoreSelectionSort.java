package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class ExamScoreSelectionSort {
	
	public static void selectionSort(int[] arr) {
		int len = arr.length;
		
		for(int i=0;i<len-1;i++) {
			
			int minIdx = i;
			
			for(int j=i+1;j<len;j++) {
				if(arr[j]< arr[minIdx]) {
					
					minIdx = j;
				}
			}
			
			int temp = arr[i];
			arr[i]= arr[minIdx];
			arr[minIdx] = temp;
			
		}
	}

	public static void main(String[] args) {
		
		// Scanner class
    	Scanner sc = new Scanner(System.in);
    	
		System.out.print("Enter he length of Array : ");
		int len = sc.nextInt();
		
		int []examScore= new int[len];
		
		System.out.println("Enter the Exam Score : ");
		for(int i=0;i<len;i++) {
			examScore[i] = sc.nextInt();
		}
		
		selectionSort(examScore);
		
		System.out.print("Score after sorting : ");
		System.out.println(Arrays.toString(examScore));
		
		
		sc.close();
	}

}
