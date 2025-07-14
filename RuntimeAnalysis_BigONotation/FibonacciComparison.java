package RuntimeAnalysis_BigONotation;

public class FibonacciComparison {
    public static void main(String[] args) {
        int[] testValues = {10, 30, 50};

        for (int n : testValues) {
            System.out.println("Fibonacci(" + n + "):");

            // Recursive (Exponential Time)
            if (n <= 30) { // Beyond 30, recursive becomes impractical
                long startRecursive = System.nanoTime();
                int fibRecursive = fibonacciRecursive(n);
                long endRecursive = System.nanoTime();
                System.out.printf("  Recursive Result: %d, Time: %.4f ms%n", fibRecursive, 
                    (endRecursive - startRecursive) / 1_000_000.0);
            } else {
                System.out.println("  Recursive Result: Unfeasible (>1hr)");
            }

            // Iterative (Linear Time)
            long startIterative = System.nanoTime();
            int fibIterative = fibonacciIterative(n);
            long endIterative = System.nanoTime();
            System.out.printf("  Iterative Result: %d, Time: %.4f ms%n%n", fibIterative, 
                (endIterative - startIterative) / 1_000_000.0);
        }
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}

