import java.util.Scanner;

public class FindLengthOfString{
    public static void main(String[] args) {
        // Create scanner class
        Scanner sc = new Scanner(System.in);
    
        // Taking the input
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        System.out.println();

        // Calling the method for count the length
        int length = countTheLength(str);
        System.out.println("Length of String by excetion handling : "+length);

        // Length of string with built in method
        System.out.println("Length of String by builtin method  : "+str.length());

        sc.close(); // close the Scanner class
    }

    // Method for count the length without using any inbuilt method  
    public static int countTheLength(String str) {
        int countLength = 0;
        int idx = 0;
        while(true){
            try {
                str.charAt(idx++);
                countLength++;
            } catch (Exception e) {
                System.out.println("Here we print the Error : "+e);
                break;
            }
        }
        return countLength;
    }
}