import java.util.ArrayList;

// Bank Class
class Bank {
    private String bankName;
    private ArrayList<Customer> customers;

    // Parametrized Constructor
    public Bank(String bankName) {
        this.bankName = bankName;
        customers = new ArrayList<>();
    }

    // Method to add a customer to the bank
    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer " + customer.getName() + " added to " + bankName);
    }

    // Method for a customer to open an account
    public void openAccount(Customer customer, String accountNumber, double initialDeposit) {
        customer.openAccount(accountNumber, initialDeposit);
    }

}

// Customer Class
class Customer {
    private String name;
    private ArrayList<Account> accounts;

    // Constructor
    public Customer(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    // Method to open a new account
    public void openAccount(String accountNumber, double initialDeposit) {
        Account newAccount = new Account(accountNumber, initialDeposit);
        accounts.add(newAccount);
        System.out.println("Account opened for " + name + " with Account Number: " + accountNumber);
    }

    // Method to view all accounts and balances
    public void viewAccounts() {
        System.out.println(name + "'s Accounts:");
        for (Account account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber() + ", Balance: " + account.getBalance());
        }
    }
}

// Account Class
class Account {
    private String accountNumber;
    private double balance;

    // Constructor
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money into account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Amount : " + amount);
        }
    }

    // Method to withdraw money from account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew Amount : " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
}
public class BankAccountHolder {
    public static void main(String[] args) {
        
    }
}
