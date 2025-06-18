import java.util.Arrays;

public class OTPGeneratorUtility {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000; // Ensures number is between 100000 to 999999
    }

    // Method to generate 10 OTPs and store in array
    public static int[] generateMultipleOTPs(int count) {
        int[] otpArray = new int[count];
        for (int i = 0; i < count; i++) {
            otpArray[i] = generateOTP();
        }
        return otpArray;
    }

    // Method to check if all OTPs are unique
    public static boolean areOTPsUnique(int[] otpArray) {
        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) {
                    return false; // Found duplicate
                }
            }
        }
        return true; // All are unique
    }

    // Main method
    public static void main(String[] args) {

        // Generate 10 OTPs
        int[] otpList = generateMultipleOTPs(10);

        // Display all OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otpList) {
            System.out.println(otp);
        }

        // Check if all OTPs are unique
        boolean unique = areOTPsUnique(otpList);

        if (unique) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are repeated.");
        }
    }
}
