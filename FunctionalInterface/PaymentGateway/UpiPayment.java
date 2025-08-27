package FunctionalInterface.PaymentGateway;

public class UpiPayment implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " via UPI.");
    }
}
