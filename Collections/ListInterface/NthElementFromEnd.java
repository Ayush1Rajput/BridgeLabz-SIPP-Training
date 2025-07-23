package Collections.ListInterface;
import java.util.*;

public class NthElementFromEnd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of List : ");
        int n = sc.nextInt();
        sc.nextLine();  

        LinkedList<String> list = new LinkedList<>();
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

        System.out.print("Enter the value of N : ");
        int N = sc.nextInt();

        findNthFromEnd(list, N);
        
        sc.close();
    }

    private static void findNthFromEnd(LinkedList<String> list, int N) {
        if (N > list.size()) {
            System.out.println("N is larger than the list size");
            return;
        }

        int indexFromEnd = list.size() - N;
        
        String result = list.get(indexFromEnd);
        
        System.out.println("The " + N + "th element from the end is: " + result);
    }
}
