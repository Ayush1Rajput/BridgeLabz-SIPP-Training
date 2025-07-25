package Collections.MapInterface;

import java.util.HashMap;

public class MergeTwoMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map1 = new HashMap<>();
		HashMap<String, Integer> map2 = new HashMap<>();
		
		map1.put("A",1);
		map1.put("B",3);
		map1.put("C",2);

		
		map2.put("A",2);
		map2.put("B",1);
		map2.put("C",4);
		
		MergeMap(map1, map2);
	}

	private static void MergeMap(HashMap<String, Integer> map1, HashMap<String, Integer> map2) {
		HashMap<String, Integer> answer = new HashMap<>();
		
		for(String s: map1.keySet()) {
			answer.put(s,answer.getOrDefault(s,0)+map1.get(s));
		}
		for(String s: map2.keySet()) {
			answer.put(s,answer.getOrDefault(s,0)+map2.get(s));
		}
		
		System.out.println("Merge Maps : "+ answer);
	}
	

}
