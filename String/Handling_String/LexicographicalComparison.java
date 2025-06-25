import java.util.Scanner;

public class LexicographicalComparison {
    public static int compareStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = Math.min(len1, len2);

        for (int i = 0; i < minLen; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            if (c1 != c2) {
                return c1 - c2; // Positive if c1 > c2, negative if c1 < c2
            }
        }

        // If all characters are equal in the shorter string
        return len1 - len2; // Longer string is considered greater
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        int result = compareStrings(str1, str2);

        if (result == 0) {
            System.out.println("The strings are equal.");
        } else if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" lexicographically.");
        } else {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" lexicographically.");
        }

        scanner.close();
    }
}
