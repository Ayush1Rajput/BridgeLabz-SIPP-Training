package Searching_StringBuilder_FileReader.StringBuilder;

import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter the String : ");
	
		String string = sc.nextLine();
	
		StringBuilder stringbuilder = new StringBuilder(string);
		
		stringbuilder.reverse();
		
		System.out.println("Reverse String : "+stringbuilder.toString());
		
		sc.close();

	}

}
