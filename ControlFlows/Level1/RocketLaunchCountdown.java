import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.println("Input the countdown start number: ");
        int counter = sc.nextInt();

        // close the scanner
        sc.close();

        // countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        // final message after countdown
        System.out.println("Rocket Launched!");
    }
}
