package FunctionalInterface.DigitalPaymentInterface;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter payment amount: ");
        double amount = sc.nextDouble();

        Payment upi = new UPI("ayush@upi");
        Payment card = new CreditCard("1234567890123456");
        Payment wallet = new Wallet("Paytm");

        upi.pay(amount);
        card.pay(amount);
        wallet.pay(amount);

        sc.close();
    }
}
