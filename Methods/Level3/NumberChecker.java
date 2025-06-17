import java.util.Scanner;

public class NumberChecker {

    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer number: ");
        int number = sc.nextInt();

        // Close the scanner
        sc.close();

        // Call all static methods and display results
        int digitCount = countDigits(number);
        System.out.println("Total number of digits: " + digitCount);

        int[] digits = storeDigits(number);

        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(digits, number));

        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);
    }

    // Method to count digits in the number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to store each digit into an array
    public static int[] storeDigits(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        return digits;
    }

    // Method to check if the number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if the number is an Armstrong number
    public static boolean isArmstrongNumber(int[] digits, int number) {
        int sum = 0;
        int power = digits.length;

        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }

        return sum == number;
    }

    // Method to find largest and second largest digits
    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + (secondLargest == Integer.MIN_VALUE ? "Not available" : secondLargest));
    }

    // Method to find smallest and second smallest digits
    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        System.out.println("Smallest digit: " + smallest);
        System.out.println("Second smallest digit: " + (secondSmallest == Integer.MAX_VALUE ? "Not available" : secondSmallest));
    }
}
