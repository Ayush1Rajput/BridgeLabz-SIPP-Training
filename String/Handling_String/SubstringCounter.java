import java.util.Scanner;

public class SubstringCounter {
    public static int countSubstringOccurrences(String text, String sub) {
        int count = 0;
        int index = 0;

        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index++; 
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the substring to count: ");
        String substring = scanner.nextLine();

        int occurrences = countSubstringOccurrences(mainString, substring);
        System.out.println("The substring \"" + substring + "\" occurs " + occurrences + " time(s).");

        scanner.close();
    }
}
