import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        playGame(sc);
        sc.close();
    }

    // Main game loop function
    static void playGame(Scanner sc) {
        int min = 0;
        int max = 100;

        System.out.println("Think of a number between 0 and 100.");
        System.out.println("I will try to guess it!");

        while (true) {
            int guess = generateRandomGuess(min, max);
            if (isCorrectGuess(sc, guess)) {
                System.out.println("Thank you for playing with me!");
                System.out.println();
                break;
            }

            if (isNumberLessThanGuess(sc)) {
                max = guess - 1;
            } else {
                min = guess + 1;
            }
        }
    }

    // Generate random number between min and max
    static int generateRandomGuess(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    // Ask the user if the guess is correct
    static boolean isCorrectGuess(Scanner sc, int guess) {
        System.out.println("Your Guess Number is " + guess);
        System.out.println("If YES, type 'YES'. Otherwise, type 'NO':");
        String check = sc.next().trim().toLowerCase();
        System.out.println();
        return check.equals("yes");
    }

    // Ask the user if their number is less than the guess
    static boolean isNumberLessThanGuess(Scanner sc) {
        System.out.println("Is your number less than my guess? Type 'YES' or 'NO':");
        String response = sc.next().trim().toLowerCase();
        System.out.println();
        return response.equals("yes");
    }
}
