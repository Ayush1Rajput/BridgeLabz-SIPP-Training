import java.util.*;

public class CompareString{
    public static void main(String[] args){

        // Create scanner class
        Scanner sc = new Scanner(System.in);

        // Take the string from user
        System.out.print("Enter the String 1 : ");
        String str1 = sc.next();
        System.out.print("Enter the String 2 : ");
        String str2 = sc.next();
        System.out.println();

        // Calling method for check the string by every character
        checkStringCharacter(str1, str2);

        // Calling the inbuild method .equals
        if(str1.equals(str2)){
            System.out.println("Both Strings are equals check by inbuilt method ");
        }else{
            System.out.println("Both Strings are not equals check by inbuilt method ");

        }


        sc.close(); // close the scanner

    }

    public static void checkStringCharacter(String str1, String str2) {
        // Check the length of each string
        if(str1.length()!=str2.length()){
            System.out.println("Length of each string is not same that\'s why is not equal");
        }
        // check the string by charcter 
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                System.out.println("Character of string not match that\'s why is not equal");
                return; // exit the method 
            }
        }

        System.out.println("Both Strings are equals ");

    }
}