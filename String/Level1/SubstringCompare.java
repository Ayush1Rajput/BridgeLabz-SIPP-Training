import java.util.*;

public class SubstringCompare {
    public static void main(String[] args) {

        // Create Scanner class
        Scanner sc = new Scanner(System.in);

        // Take string and index input from user
        System.out.print("Enter the original String: ");
        String original = sc.next();
        System.out.print("Enter the start index: ");
        int start = sc.nextInt();
        System.out.print("Enter the end index: ");
        int end = sc.nextInt();
        System.out.println();


        // Calling method to get substring using charAt
        String customSubstring = SubstringUsingCharAt(original, start, end);
        System.out.println("Substring using charAt: " + customSubstring);

        // Using built-in substring method
        String builtInSubstring = original.substring(start, end);
        System.out.println("Substring using built-in method: " + builtInSubstring);

        // Compare both substrings using charAt
        boolean isSame = compareStringsUsingCharAt(customSubstring, builtInSubstring);

        // Display result of comparison
        if(isSame) {
            System.out.println("Both substrings are equal checked using charAt");
        } else {
            System.out.println("Both substrings are NOT equal checked using charAt");
        }

        sc.close(); // close the scanner
    }

    // Method to create substring using charAt
    public static String SubstringUsingCharAt(String str, int start, int end) {
        String result = "";
        for(int i = start; i < end; i++) {
            result += str.charAt(i); // append character one by one
        }
        return result;
    }

    // Method to compare two strings character by character using charAt
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }

        for(int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
