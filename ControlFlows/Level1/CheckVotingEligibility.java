import java.util.Scanner;

public class CheckVotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.println("Input the person's age: ");
        int age = sc.nextInt();

        // close the scanner
        sc.close();

        // checking if the person is eligible to vote
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}
