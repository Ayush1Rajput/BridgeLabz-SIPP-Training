import java.util.ArrayList;
import java.util.Scanner;

public class ReverseSentence{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the input : " );
        String text = sc.nextLine();

        reverseSentance(text);

        sc.close();
    }

    public static void reverseSentance(String text) {

        // Method One for reverse the sentence
        ArrayList<String> arr = new ArrayList<>();

        for(int i=0;i<text.length();i++){
            String str = "";
            while(text.charAt(i)!=' ' && i<text.length()-1){
                str+=text.charAt(i);
                i++;
            }
            if(i==text.length()-1){
                str+=text.charAt(text.length()-1);
            }
            arr.add(str);
        }

        String ans = "";
        for(int i=0;i<arr.size();i++){
            StringBuilder temp = new StringBuilder(arr.get(i));
            temp.reverse();
            ans+= temp.toString();
            ans+=" ";
        }

        System.out.println(ans.trim());


        // Method Two for reverse the sentence

        
        // String[] arr = text.split(" ");
        // String answer = "";

        // for(int i=0;i<arr.length;i++){
        //     String str = "";
        //     for(int j=arr[i].length()-1;i>=0;i--){
        //         str+=arr[i].charAt(j);
        //     }
        //     answer+= str +" ";
        // }

        // answer = answer.trim();
        // System.out.println(answer);
        // return;
    }
}
