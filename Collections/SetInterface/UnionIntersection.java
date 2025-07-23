package Collections.SetInterface;
import java.util.*;

public class UnionIntersection{

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

        Set<Integer> union = unionOfSets(set1, set2);
        Set<Integer> intersection = intersectionOfSets(set1, set2);

        System.out.println("Union of Set1 and Set2: " + union);
        System.out.println("Intersection of Set1 and Set2: " + intersection);
        
        sc.close();
    }

    private static Set<Integer> unionOfSets(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new HashSet<>(set1);  
        union.addAll(set2);  
        return union;
    }

    private static Set<Integer> intersectionOfSets(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = new HashSet<>(set1);  
        intersection.retainAll(set2);  
        return intersection;
    }
}
