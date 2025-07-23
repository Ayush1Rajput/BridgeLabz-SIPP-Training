package Collections.QueueInterface;
import java.util.*;

public class GenerateBinaryNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        List<String> binaryNumbers = generateBinaryNumbers(N);

        System.out.println("First " + N + " binary numbers: " + binaryNumbers);
        
        sc.close();
    }

    private static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        for (int i = 0; i < N; i++) {
            String current = queue.remove();
            result.add(current);

            queue.add(current + "0");
            queue.add(current + "1");
        }

        return result;
    }
}
