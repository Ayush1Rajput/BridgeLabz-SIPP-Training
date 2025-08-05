package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class CheckedException {
	public static void main(String[] args) {
		String fileName = "input.txt";
		
		try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			while((line=reader.readLine())!=null) {
				System.out.print(line);
			}
			
		}
		catch(Exception e){
			System.out.println("Error : "+e.getMessage());
		}
	}
}
