package ControlFlows.Level2;
import java.util.Scanner;

public class MultiplicationTableFrom6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.println("Enter a number to print its multiplication table from 6 to 9: ");
        int number = sc.nextInt();

        // close the scanner
        sc.close();

        // using for loop to print table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
