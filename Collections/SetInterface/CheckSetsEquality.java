package Collections.SetInterface;
import java.util.*;

public class CheckSetsEquality {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements for Set1: ");
        int n1 = sc.nextInt();
        sc.nextLine(); 

        Set<Integer> set1 = new HashSet<>();
        System.out.println("Enter the elements for Set1: ");
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextInt());
        }
        
        System.out.print("Enter the number of elements for Set2: ");
        int n2 = sc.nextInt();
        sc.nextLine(); 

        Set<Integer> set2 = new HashSet<>();
        System.out.println("Enter the elements for Set2: ");
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }

        boolean result = areSetsEqual(set1, set2);
        System.out.println("The two sets are equal : " + result);
        
        sc.close();
    }

    private static boolean areSetsEqual(Set<Integer> set1, Set<Integer> set2) {
        return set1.equals(set2);
    }
}
