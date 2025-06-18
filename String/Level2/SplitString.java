import java.util.Scanner;

public class SplitString {
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

        // Method for count the number of words in string
        int numberOfWords = countNumberOfWords(str);

        // Method for Split the String into words 
        String[] wordsArray = splitStringIntoWords(str, numberOfWords);

        // Split the string into array
        String[] wordsArrayBySplit = str.split(" ");

        boolean isSame = compareString(wordsArray, wordsArrayBySplit);

        System.out.print("The string arrays are : " + (isSame?"Same":"Not Same"));

        sc.close(); // Close the scanner 

    }

    private static int countNumberOfWords(String str) {
        int countWords = 0;
        str.trim();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                countWords++;
            }
        }
        return countWords;
    }

    public static boolean compareString(String[] wordsArray, String[] wordsArrayBySplit) {
        if(wordsArray.length!= wordsArrayBySplit.length){
            return false;
        }
        for(int i=0;i<wordsArray.length;i++){
            if(!wordsArray[i].equals(wordsArrayBySplit[i])){
                return false;
            }
        }
        return true;
    }

    // Method for split the String into String Array without using split() method
    public static String[] splitStringIntoWords(String str, int len) {
        String[] list = new String[len];
        int idx = 0;
        for(int i=0;i<str.length();i++){
            String temp = "";
            while(i < str.length() && str.charAt(i)!=' '){
                temp+=str.charAt(i);
                i++;
            }
            list[idx++] = temp;
        }
        return list;
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
