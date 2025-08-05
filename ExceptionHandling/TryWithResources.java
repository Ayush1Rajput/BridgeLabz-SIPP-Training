package ExceptionHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
	 public static void main(String[] args) {
	        String fileName = "input.txt";

	        
	        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
	        	
	            String firstLine = reader.readLine(); 
	            if (firstLine != null) {
	                System.out.println(firstLine);
	            } else {
	                System.out.println("File is empty.");
	            }
	        } catch (IOException e) {
	            System.out.println("Error reading file");
	        }
	    }
}
