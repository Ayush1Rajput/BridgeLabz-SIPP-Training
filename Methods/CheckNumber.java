import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {

        // Creating the scanner object
        Scanner sc = new Scanner(System.in);

        // Getting input from user 
        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        sc.close(); // close the scanner class

        // call the method for check the number
        int answer = checkNumber(number);

        // display the output
        System.out.println("The given number is "+answer);
    }

    // Method for checking the number 
    public static int checkNumber(int num){

        // condition for check the number is positive , zero or negative
        if(num<0){
            return  -1;
        }else if(num==0){
            return 0;
        }else{
            return 1;
        }
    }
}
