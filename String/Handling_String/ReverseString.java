import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        reverseString(str);

        sc.close();
    }

    public static void reverseString(String str){
        String reverse = "";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }

        System.out.println("Reverse of give string is :" + reverse);
    }
}
