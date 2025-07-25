package Collections.MapInterface;

import java.util.*;

public class FrequencyCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> map = new HashMap<>();
		
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		
		String[] array = str.split(" ");
		
		for(int i=0;i<array.length;i++) {
			map.put(array[i].trim(), map.getOrDefault(array[i].trim(),0)+1);
		}
		
		System.out.println(map);
		
		sc.close();
		}
}
