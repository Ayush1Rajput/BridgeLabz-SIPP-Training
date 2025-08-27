package FunctionalInterface.DigitalPaymentInterface;

public class UPI implements Payment {
    private String upiId;

    public UPI(String upiId) {
        this.upiId = upiId;
    }

    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " via UPI ID: " + upiId);
    }
}
