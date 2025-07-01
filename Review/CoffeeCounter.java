import java.util.Scanner;

public class CoffeeCounter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while(flag){
            System.out.println("\n----- Welcome to the Cafe -----");
            System.out.println();
            System.out.println("If you want the \'Espresso\' then enter 1 \nIf you want the \'Cappuccino\' then enter 2 \nIf you want the \'Latte\' then enter 3 ");
            System.out.print("Enter the Input : ");
            int type = sc.nextInt();
            System.out.print("Enter the quantity : ");
            int quantity = sc.nextInt();
            System.out.println("Amount of your order Rs. " + calculateBill(type, quantity));
            System.out.print("\n If there is anyother order then enter '1' Otherwise '0' : ");
            int nextOrder = sc.nextInt();
            if(nextOrder==1){
                flag=true;
            }else {
                System.out.println("-----Thank You ! -----");
                flag=false;
            }
        }
        sc.close();
    }

    
    // Method for calcuating the bill
    public static double calculateBill(int type, int quantity){
        double amount = 0.0;
        if(type==1){
            amount+= 100 * quantity;
        }else if(type == 2){
            amount+= 120 * quantity;
        }else if(type== 3){
            amount+= 140 * quantity;
        }
        double GST = (amount * 18)/100; // Calculate the GST 

        return amount+GST;
    }
}


