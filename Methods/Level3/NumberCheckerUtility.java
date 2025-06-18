import java.util.Scanner;

public class NumberCheckerUtility {

    // Method to count the number of digits in a number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store digits in an array
    public static int[] getDigitsArray(int number) {
        String numberStr = String.valueOf(number);
        int[] digits = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = Character.getNumericValue(numberStr.charAt(i));
        }
        return digits;
    }

    // Method to find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2); // Using Math.pow
        }
        return sum;
    }

    // Method to check if the number is a Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to get frequency of each digit in the number using 2D array
    public static int[][] getDigitFrequency(int[] digits) {
        int[][] freqArray = new int[10][2]; // [digit][frequency]

        for (int i = 0; i < 10; i++) {
            freqArray[i][0] = i; // Storing digit
            freqArray[i][1] = 0; // Initial frequency
        }

        for (int digit : digits) {
            freqArray[digit][1]++;
        }

        return freqArray;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting user for input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Getting digits array
        int[] digits = getDigitsArray(number);

        // Finding count of digits
        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        // Finding sum of digits
        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);

        // Finding sum of squares of digits
        int squareSum = sumOfSquares(digits);
        System.out.println("Sum of squares of digits: " + squareSum);

        // Checking if Harshad number
        boolean harshad = isHarshadNumber(number, digits);
        if (harshad) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }

        // Finding frequency of digits
        int[][] freq = getDigitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit: " + freq[i][0] + " => Frequency: " + freq[i][1]);
            }
        }

        sc.close();
    }
}
