import java.util.Scanner;

public class RocketLaunchCountdownUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.println("Input the countdown start number: ");
        int counter = sc.nextInt();

        // close the scanner
        sc.close();

        // countdown using For-loop
        for (int i=counter;i>0;i--) {
            System.out.println(i);
        }

        // final message after countdown
        System.out.println("Rocket Launched!");
    }
}
