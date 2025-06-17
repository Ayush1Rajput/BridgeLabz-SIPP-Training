import java.util.Scanner;

public class MaximumNumberOfHandshake {
    public static void main(String[] args) {
         // Creating the scanner object
        Scanner sc = new Scanner(System.in);

        // Getting input from user
        System.out.print("Enter the number of students : ");
        int numberofstudent = sc.nextInt();

        // calling the method for count the maximum number of handshake 
        countNumberHandshake(numberofstudent);
    }

    // Creating the method for counting the number of handshake
    public static void countNumberHandshake(int n){

        // count the number of combination for handshake by using formula 
        int combination = (n *(n-1))/2;
        // showcase the output
        System.out.println("In "+ n+" students the maximum number of possible handshake are "+combination);
    }
}
