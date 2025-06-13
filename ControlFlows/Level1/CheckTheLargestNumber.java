import java.util.Scanner;

public class CheckTheLargestNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.println("Input the 3 numbers ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        // close the scanner
        sc.close();

        // Writting the logic for getting the largest number 
        if(num1 > num2 && num1 > num3){
            System.out.println("Is the first number the largest? YES");
        }else if(num2 > num1 && num2 > num3){
            System.out.println("Is the second number the largest? YES");
        }else{
            System.out.println("Is the third number the largest? YES");
        }
    }
}