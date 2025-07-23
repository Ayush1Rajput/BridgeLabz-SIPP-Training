package Collections.ListInterface;
import java.util.*;

public class RemoveDuplicates{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of List : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        removeDuplicates(arr);
        
        sc.close();
    }

    private static void removeDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();

        System.out.print("List before removing duplicates : ");
        printArr(arr);
        
        for (int num : arr) {
            if (!seen.contains(num)) {
                seen.add(num);
                resultList.add(num);
            }
        }

        System.out.println("List after removing duplicates : ");
        printList(resultList);
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void printList(List<Integer> list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
