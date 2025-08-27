package FunctionalInterface.DigitalPaymentInterface;

public class Wallet implements Payment {
    private String walletName;

    public Wallet(String walletName) {
        this.walletName = walletName;
    }

    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " via " + walletName + " Wallet.");
    }
}