package ControlFlows.Level2;

import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input for age and height of Amar
        System.out.println("Enter the age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.println("Enter the height of Amar (in cm): ");
        int heightAmar = sc.nextInt();

        // taking input for age and height of Akbar
        System.out.println("Enter the age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.println("Enter the height of Akbar (in cm): ");
        int heightAkbar = sc.nextInt();

        // taking input for age and height of Anthony
        System.out.println("Enter the age of Anthony: ");
        int ageAnthony = sc.nextInt();
        System.out.println("Enter the height of Anthony (in cm): ");
        int heightAnthony = sc.nextInt();

        // close the scanner
        sc.close();

        // finding the youngest friend
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Amar is the youngest.");
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            System.out.println("Akbar is the youngest.");
        } else if (ageAnthony < ageAmar && ageAnthony < ageAkbar) {
            System.out.println("Anthony is the youngest.");
        } else {
            System.out.println("There is a tie in ages.");
        }

        // finding the tallest friend
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Amar is the tallest.");
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("Akbar is the tallest.");
        } else if (heightAnthony > heightAmar && heightAnthony > heightAkbar) {
            System.out.println("Anthony is the tallest.");
        } else {
            System.out.println("There is a tie in heights.");
        }
    }
}

