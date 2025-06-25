import java.util.Scanner;

public class RemoveCharacter {
    public static String removeCharacter(String input, char toRemove) {
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current != toRemove) {
                result += current;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char toRemove = scanner.next().charAt(0);

        String modified = removeCharacter(input, toRemove);
        System.out.println("Modified String: \"" + modified + "\"");

        scanner.close();
    }
}
