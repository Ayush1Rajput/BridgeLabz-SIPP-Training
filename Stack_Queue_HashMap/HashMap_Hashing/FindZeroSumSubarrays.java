package Stack_Queue_HashMap.HashMap_Hashing;

import java.util.*;

public class FindZeroSumSubarrays {
    
    public void findSubarraysWithZeroSum(int[] arr) {
        Map<Integer, List<Integer>> sumIndexMap = new HashMap<>();
        int sum = 0;
        boolean found = false;

        System.out.println("\nSubarrays with sum zero:");
        sumIndexMap.put(0, new ArrayList<>());
        sumIndexMap.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sumIndexMap.containsKey(sum)) {
                List<Integer> startIndices = sumIndexMap.get(sum);
                for (int start : startIndices) {
                    System.out.print("Subarray found from index " + (start + 1) + " to " + i + " → [");
                    for (int k = start + 1; k <= i; k++) {
                        System.out.print(arr[k] + (k < i ? ", " : ""));
                    }
                    System.out.println("]");
                    found = true;
                }
            }

            sumIndexMap.putIfAbsent(sum, new ArrayList<>());
            sumIndexMap.get(sum).add(i);
        }

        if (!found) {
            System.out.println("No subarray with sum zero found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FindZeroSumSubarrays finder = new FindZeroSumSubarrays();

        System.out.print("Enter number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        finder.findSubarraysWithZeroSum(arr);
        
        scanner.close();
    }
}
