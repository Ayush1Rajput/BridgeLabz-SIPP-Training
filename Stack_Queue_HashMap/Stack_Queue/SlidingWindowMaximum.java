package Stack_Queue_HashMap.Stack_Queue;

import java.util.*;

public class SlidingWindowMaximum {

    public void findSlidingWindowMaximum(int[] arr, int k) {
        int n = arr.length;
        if (n == 0 || k <= 0 || k > n) {
            System.out.println("Invalid input. Please ensure 0 < k <= array length.");
            return;
        }

        Deque<Integer> deque = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // Remove indices out of current window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove smaller elements in k range as they are not useful
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }

            // Add current index
            deque.offerLast(i);

            // Add to result when window size is reached
            if (i >= k - 1) {
                result.add(arr[deque.peekFirst()]);
            }
        }

        System.out.println("\nMaximum elements in each sliding window of size " + k + ":");
        for (int max : result) {
            System.out.print(max + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SlidingWindowMaximum windowMax = new SlidingWindowMaximum();

        System.out.print("Enter number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter window size (k): ");
        int k = scanner.nextInt();

        windowMax.findSlidingWindowMaximum(arr, k);

        scanner.close();
    }
}

