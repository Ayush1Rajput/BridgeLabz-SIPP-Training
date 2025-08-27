package FunctionalInterface.PasswordValidatorDemo;

public interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        // At least 8 chars, contains digit, uppercase, lowercase, special char
        return password.length() >= 8 &&
               password.matches(".*[0-9].*") &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[a-z].*") &&
               password.matches(".*[@#$%^&+=!].*");
    }
}
