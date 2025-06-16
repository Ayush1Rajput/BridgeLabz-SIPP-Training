import java.util.*;
public class ValidAgeForVote{
    public static void main(String[] args) {

        // creating the scanner class
        Scanner sc = new Scanner(System.in);
        int n = 10;

        // creating the integer array for age 
        int[] age = new int[n];

        System.out.println("Input the ages ");

        // loop for user input of age
        for(int i=0;i<n;i++){
            age[i]=sc.nextInt();

        }

        // condition for checking the age is valid or not
        for(int x:age){
            if(x<0){
                System.err.println("Invalid Age");
            }else if(x>=18){
                System.out.println("The student with the age "+x+" can vote");
            }else{
                System.out.println("The student with the age "+x+" cannot vote");

            }
        }

        // close the scanner class
        sc.close();
    }
}