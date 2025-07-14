package Searching_StringBuilder_FileReader.StringBuffer;
import java.util.*;

public class ConcatenateStringArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of array : ");
		int length = sc.nextInt();
		
		System.out.println("Enter the string array : ");
		String[] array = new String[length];
		
		for(int i=0;i<length;i++) {
			array[i]=sc.next();
		}
		
		
		StringBuffer stringbuffer  = new StringBuffer();
		
		for(int i=0;i<length;i++) {
			stringbuffer.append(array[i]);
		}
		
		System.out.println("String array After Concatination : "+ stringbuffer.toString());

	}

}
