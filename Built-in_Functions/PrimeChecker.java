import java.util.Scanner;

public class PrimeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number to check if it's prime: ");
        int number = sc.nextInt();

        // Call the function to check for prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        sc.close();
    }

    // Function to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) return false; // 0, 1 and negatives are not prime
        if (n == 2) return true;  // 2 is the only even prime
        if (n % 2 == 0) return false; // eliminate even numbers > 2

        // Check divisibility from 3 up to √n
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
