package Collections.ListInterface;
import java.util.*;

public class FrequencyOfElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of List : ");
        int n = sc.nextInt();
        sc.nextLine();  
        System.out.println("Enter the elements : ");
        String[] arr = new String[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        
        countFrequency(arr);
        
        sc.close();
    }

    private static void countFrequency(String[] arr) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        System.out.print("Input List : ");
        printArr(arr);
        
        
        for (String str : arr) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }

        System.out.println("Frequency of elements : " + frequencyMap);
    }
    
    private static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
