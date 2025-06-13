import java.util.*;
public class DivisibilityOf5{
    public static void main(String[] args) {
        // Creating scanner class
        Scanner sc = new Scanner(System.in);

        // getting input from user
        System.out.print("Input the number : "); 
        int num = sc.nextInt();

        System.out.print(" Is the number "+num +" divisible by 5? ");
        
        // Writting the logic
        if(num%5==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        // close the scanner class
        sc.close();
    }
}