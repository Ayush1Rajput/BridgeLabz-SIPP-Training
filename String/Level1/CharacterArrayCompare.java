import java.util.Scanner;

public class CharacterArrayCompare {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take string input from user
        System.out.print("Enter the String: ");
        String str = sc.next();

        System.out.println();

        sc.close(); // close the scanner 

        // Calling method for get every charcter without using inbuild method 
        char[] charArray1 = getCharacterByLoop(str);

        // Calling method for get every charcter without using inbuild method 
        char[] charArray2 = getCharacterByCharArray(str);

        boolean isSame = compareCharArrays(charArray1, charArray2);

        // Display result
        if (isSame) {
            System.out.println("Both character arrays are equal.");
        } else {
            System.out.println("Both character arrays are NOT equal.");
        }
        
    }


    // method by using inbuild toCharArray()
    private static char[] getCharacterByCharArray(String str) {
        char[] charArray = str.toCharArray();
        System.out.print("Every charcter of string "+str+" using toCharArray() are : ");
        for(char ch:str.toCharArray()){
            System.out.print(ch+" ");
        }
        System.out.println();
        return charArray;
    }

    // Method by using loop
    public static char[] getCharacterByLoop(String str) {
        char[] charArray = new char[str.length()];
        System.out.print("Every charcter of string "+str+" using loop are : ");
        for(int i=0;i<str.length();i++){
            charArray[i]=str.charAt(i);
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
        return charArray;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

}
