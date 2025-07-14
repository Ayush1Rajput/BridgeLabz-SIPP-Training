package Searching_StringBuilder_FileReader.LinearSearch;

import java.util.Scanner;

public class FindNegativeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of Array : ");
		int len = sc.nextInt();
		
		System.out.println("Enter the elements of Array : ");
		int[] array = new int[len];
		
		for(int i=0;i<len;i++) {
			array[i] = sc.nextInt();
		}
		
		
		int answer  = findNunber(array);
		
		System.out.println("Answer index : "+ answer);
		
		sc.close();
		
	}

	public static int findNunber(int[] array) {
		for(int i=0;i<array.length;i++) {
			if(array[i]<0) {
				return i;
			}
		}
		return -1;		
	}

}
