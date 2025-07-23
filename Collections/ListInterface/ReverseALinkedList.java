package Collections.ListInterface;
import java.util.*;

public class ReverseALinkedList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of List : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements : ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		reveseArrayList(arr);
		reveseLinkedList(arr);
		
		
	}

	private static void reveseArrayList(int[] arr) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();
		System.out.print("List before reverse : ");
printArr(arr);
		
		for(int i=arr.length-1;i>=0;i--) {
			list.add(arr[i]);
		}
		System.out.println("List after reverse : "+ list);
				
	}
	
	private static void printArr(int[] arr) {

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}

	private static void reveseLinkedList(int[] arr) {
		
		LinkedList<Integer> list = new LinkedList<>();
		System.out.print("LinkedList before reverse : ");
		printArr(arr);
		
		for(int i=0;i<arr.length;i++) {
			list.addFirst(arr[i]);
		}
		System.out.println("LinkedList after reverse : "+ list);
				
	}

}
