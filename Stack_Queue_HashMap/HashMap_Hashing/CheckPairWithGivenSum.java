package Stack_Queue_HashMap.HashMap_Hashing;
import java.util.HashSet;
import java.util.Scanner;

public class CheckPairWithGivenSum {

    public void checkForPair(int[] arr, int targetSum) {
        HashSet<Integer> seen = new HashSet<>();
        boolean found = false;

        for (int num : arr) {
            int complement = targetSum - num;
            if (seen.contains(complement)) {
                System.out.println("Pair found: (" + complement + ", " + num + ")");
                found = true;
                break;
            }
            seen.add(num);
        }

        if (!found) {
            System.out.println("No pair with the given sum was found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckPairWithGivenSum checker = new CheckPairWithGivenSum();

        System.out.print("Enter number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int targetSum = scanner.nextInt();

        checker.checkForPair(arr, targetSum);

        scanner.close();
    }
}
