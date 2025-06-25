public class BankAccount{
    // static variables
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;

    private final int accountNumber;
    private String accountHolderName;
    private double balance;

    // Parameterized Constructor 
    public BankAccount(int accountNumber,String accountHolderName, double balance ){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;

        // When new user is created
        totalAccounts++;
    }

    // Method for depostie Money
    public void depositeMoney(double amount){
        balance+=amount;
    }

    // Method for withdraw Money
    public void withdrawMoney(double amount){
        balance-=amount;
    }

    // Method for get number of total account
    public static void getTotalAccount(){
        System.out.println("\nNumber of total bank accounts in Bank : "+ totalAccounts);
    }

    // Method for display the details of Account holder
    public void displayDetails(){
        System.out.println("\nBank Name : " + bankName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Total balance available : "+ balance);

    }

    public static void main(String[] args) {
        BankAccount bank = new BankAccount(1100110,"Ayush", 55000);
    
        bank.depositeMoney(4000);

        bank.displayDetails();

        bank.withdrawMoney(3000);
        bank.displayDetails();


        BankAccount bank1 = new BankAccount(213978,"XYZ",7818);

        getTotalAccount();  // Static method

        bank1.displayDetails();


    }
}