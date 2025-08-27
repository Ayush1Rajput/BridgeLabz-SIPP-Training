package FunctionalInterface.PaymentGateway;

public class Main {
	 public static void main(String[] args) {
	        PaymentProcessor upi = new UpiPayment();
	        upi.pay(1200);
	        upi.refund(200);  // uses default

	        PaymentProcessor card = new CreditCardPayment();
	        card.pay(2500);
	        card.refund(500); // overridden version
	    }
}
