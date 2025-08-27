package FunctionalInterface.PasswordValidatorDemo;

import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password to validate: ");
        String password = sc.nextLine();

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong Password Accepted.");
        } else {
            System.out.println("Weak Password. Please follow password policy.");
        }

        sc.close();
    }
}
