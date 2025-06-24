public class BankAccount {
    // Attributes
    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money (if sufficient balance)
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: $" + amount);
            } else {
                System.out.println("Insufficient balance for withdrawal.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }

    // Method to display full account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        displayBalance();
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        // Creating a bank account
        BankAccount account = new BankAccount("Ayush ", "ACC123456", 10000.00);

        // Display account details
        account.displayAccountDetails();

        System.out.println();
        System.out.println(" --- Performing Transactions ---");
        account.deposit(500.00);
        account.withdraw(200.00);
        account.withdraw(2000.00); // Should fail
        account.displayBalance();
    }
}
