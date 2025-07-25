package Collections.MapInterface;

import java.util.HashMap;

public class KeyWithHighestValue {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("A",10);
		map.put("B",20);
		map.put("C",25);
		
		String answer  = HighestValue(map);
		
		System.out.println("Key with highest value : " + answer);

	}
	
	private static String HighestValue(HashMap<String, Integer> map) {
		String str = "";
		int high  = -1;
		for(String s: map.keySet()) {
			if(map.get(s)> high) {
				str= s;
				high = map.get(s);
			}
		}
		
		return str;
	}

}
