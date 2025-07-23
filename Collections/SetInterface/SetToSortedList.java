package Collections.SetInterface;
import java.util.*;

public class SetToSortedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements for the Set: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Set<Integer> set = new HashSet<>();
        System.out.println("Enter the elements for the Set: ");
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        List<Integer> sortedList = convertSetToSortedList(set);

        System.out.println("Sorted List: " + sortedList);
        
        sc.close();
    }

    private static List<Integer> convertSetToSortedList(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set); 
        Collections.sort(list); 
        return list;
    }
}
