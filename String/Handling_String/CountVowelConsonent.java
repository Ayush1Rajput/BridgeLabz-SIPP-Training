import java.util.Scanner;

public class CountVowelConsonent{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        count(str);

        sc.close();

    }
    public static void count(String str){
        int vowel = 0;
        int consonent = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ){
                vowel ++;
            }else{
                consonent++;
            }
        }
        System.out.println("Number of vowels are : " + vowel);
        System.out.println("Number of consonents are : " + consonent);
        
    }
}