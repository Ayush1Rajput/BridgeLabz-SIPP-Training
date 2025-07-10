package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class StudentAgeCountingSort {
	
	public static int[] countSort(int[] inputArray) {
        int N = inputArray.length;
        int M = 0;

        for (int i = 0; i < N; i++) {
            M = Math.max(M, inputArray[i]);
        }

        int[] countArray = new int[M + 1];

        for (int i = 0; i < N; i++) {
            countArray[inputArray[i]]++;
        }

        for (int i = 1; i <= M; i++) {
            countArray[i] += countArray[i - 1];
        }

        int[] outputArray = new int[N];

        for (int i = N - 1; i >= 0; i--) {
            outputArray[countArray[inputArray[i]] - 1] = inputArray[i];
            countArray[inputArray[i]]--;
        }

        return outputArray;
    }

	public static void main(String[] args) {
		
		// Scanner class
    	Scanner sc = new Scanner(System.in);
    	
		System.out.print("Enter he length of Array : ");
		int len = sc.nextInt();
		
		int []age= new int[len];
		
		System.out.println("Enter the Age: ");
		for(int i=0;i<len;i++) {
			age[i] = sc.nextInt();
		}
		
		int[] answer = countSort(age);
		
		System.out.print("Age in sorted way : ");
		System.out.println(Arrays.toString(answer));
		
		sc.close();
	}

}
