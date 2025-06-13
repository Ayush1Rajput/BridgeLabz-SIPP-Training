import java.util.Scanner;
public class IntOperation{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
        input.close();
    }
}