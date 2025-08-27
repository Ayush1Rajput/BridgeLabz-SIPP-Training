package FunctionalInterface.DigitalPaymentInterface;

public class CreditCard implements Payment {
    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card ending with " + cardNumber.substring(cardNumber.length() - 4));
    }
}
