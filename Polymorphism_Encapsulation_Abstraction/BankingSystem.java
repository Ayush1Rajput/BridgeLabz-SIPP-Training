import java.util.ArrayList;

// Abstract class BankAccount
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    // Parameterized Constructor
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getter and Setter methods (Encapsulation)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Concrete methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    // Abstract method for calculating interest
    abstract double calculateInterest();
    
    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("\n---- Account Details ----");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

// SavingsAccount class extending BankAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    double calculateInterest() {
        return getBalance() * interestRate;
    }
}

// CurrentAccount class extending BankAccount
class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    double calculateInterest() {
        return 0.0; // No interest for Current Account
    }
}

// Loanable interface
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility(double annualIncome);
}

// SavingsAccount class implementing Loanable interface
class LoanableSavingsAccount extends SavingsAccount implements Loanable {
    public LoanableSavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance, interestRate);
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan applied for: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility(double annualIncome) {
        return annualIncome >= 50000; // Loan eligibility condition
    }
}

// CurrentAccount class implementing Loanable interface
class LoanableCurrentAccount extends CurrentAccount implements Loanable {
    public LoanableCurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance, overdraftLimit);
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan applied for: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility(double annualIncome) {
        return annualIncome >= 75000; // Loan eligibility condition
    }
}

// BankingSystem class to demonstrate polymorphism and loan application
public class BankingSystem {

    public static void main(String[] args) {
        // Create a list of accounts
        ArrayList<BankAccount> accounts = new ArrayList<>();
        
        // Adding different account types to the list
        accounts.add(new SavingsAccount("SA123", "Alice", 10000, 0.05));
        accounts.add(new CurrentAccount("CA456", "Bob", 5000, 1000));
        accounts.add(new LoanableSavingsAccount("LSA789", "Charlie", 15000, 0.06));
        accounts.add(new LoanableCurrentAccount("LCA012", "David", 3000, 2000));

        // Demonstrate polymorphism: process different account types
        for (BankAccount account : accounts) {
            account.displayAccountDetails();
            System.out.println("Interest: " + account.calculateInterest());
            
            // Demonstrate loan application and eligibility for loanable accounts
            if (account instanceof Loanable) {
                Loanable loanableAccount = (Loanable) account;
                loanableAccount.applyForLoan(50000);
                boolean eligible = loanableAccount.calculateLoanEligibility(60000);
                System.out.println("Loan eligibility: " + eligible);
            }
            System.out.println();
        }

        // Demonstrate deposit and withdrawal
        BankAccount account1 = accounts.get(0); // SavingsAccount for Alice
        account1.deposit(5000);
        account1.withdraw(2000);
        System.out.println("Updated Balance: " + account1.getBalance());
    }
}
