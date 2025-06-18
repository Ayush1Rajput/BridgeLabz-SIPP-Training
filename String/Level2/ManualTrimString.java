import java.util.Scanner;

public class ManualTrimString {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the string with leading and trailing spaces: ");
        String input = sc.nextLine();
        System.out.println();

        // Get the start and end index after trimming manually
        int[] range = findTrimIndices(input);

        // Create trimmed string using custom substring method
        String trimmedByCharAt = customSubstring(input, range[0], range[1]);

        // Use built-in trim for comparison
        String trimmedByBuiltin = input.trim();

        // Compare both strings using custom comparison
        boolean isSame = compareStrings(trimmedByCharAt, trimmedByBuiltin);

        // Display the results
        System.out.println("Trimmed String (charAt method): [" + trimmedByCharAt + "]");
        System.out.println("Trimmed String (built-in trim): [" + trimmedByBuiltin + "]");
        System.out.println("Comparison Result : " + (isSame ? "Same" : "Not Same"));

        sc.close(); // Close Scanner
    }

    // Method to find the start and end index of trimmed string
    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end = countLength(str) - 1;

        // Find first non-space from start
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Find last non-space from end
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end}; // inclusive end index
    }

    // Method to count length of the string without using length()
    public static int countLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            
        }
        return count;
    }

    // Custom method to create substring using charAt()
    public static String customSubstring(String str, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }

        return result;
    }

    // Custom method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        int len1 = countLength(s1);
        int len2 = countLength(s2);

        if (len1 != len2) {
            return false;
        }

        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
