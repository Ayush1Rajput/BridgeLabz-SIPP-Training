import java.util.Scanner;

public class IsFirstSmallestOutOf3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking the 3 input numbers
        System.out.println("Input 3 numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1<num2 && num1 < num3){
            System.out.println("Is the first number the smallest? YES");
        }else{
            System.out.println("Is the first number the smallest? NO");

        }
        sc.close();

    }
}
