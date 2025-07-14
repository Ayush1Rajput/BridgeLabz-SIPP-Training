package Searching_StringBuilder_FileReader.StringBuilder;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String : ");
		
		String string = sc.nextLine();
		
		HashSet<Character> set  = new HashSet<>();
		StringBuilder stringbuilder = new StringBuilder();
		
		for(char ch:string.toCharArray()) {
			if(set.contains(ch) || ch==' ') {
				continue;
			}else {
				stringbuilder.append(ch);
				set.add(ch);
			}
		}
		
		System.out.println("String witout duplicates : "+ stringbuilder.toString());

	}

}
