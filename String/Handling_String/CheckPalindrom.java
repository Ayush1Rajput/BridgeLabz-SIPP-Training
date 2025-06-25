import java.util.Scanner;

public class CheckPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String text = sc.next();

        checkPalindrome(text);

        sc.close();
    }

    public static void checkPalindrome(String str){
        int length = str.length();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!= str.charAt(length-1-i)){
                System.out.println("Given String is not a palidrome");
                return;
            }
        }

        System.out.println("Given String is a palidrome");

    }
}
