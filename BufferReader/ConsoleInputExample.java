import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputExample {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter your name: ");
            String name = br.readLine();  // Reads input from the user
            System.out.println("Hello, " + name + "!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
