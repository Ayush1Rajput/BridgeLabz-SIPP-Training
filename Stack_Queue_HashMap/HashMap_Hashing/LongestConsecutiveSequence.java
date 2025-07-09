package Stack_Queue_HashMap.HashMap_Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveSequence {

    public int findLongestConsecutiveSequence(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int maxLength = 0;

        // Add all elements to the set
        for (int num : arr) {
            set.add(num);
        }

        // Find the longest consecutive sequence
        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();

        System.out.print("Enter number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int length = lcs.findLongestConsecutiveSequence(arr);
        System.out.println("\nLength of the longest consecutive sequence: " + length);

        scanner.close();
    }
}
