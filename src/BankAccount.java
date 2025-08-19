public class BankAccount {

    public static String bankName = "Liceo Bank";
    public static double interestRate = 0.03;
    public static int totalAccounts = 0;

    private static int accountCounter = 1;

    public static String generateAccountNumber() {
        return String.format("ACC%03d", accountCounter++);
    }

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String name, double initialBalance) {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = name;
        this.balance = initialBalance;
        totalAccounts++;

        System.out.printf("Account Created: %s for %s with initial balance: $%.1f%n",
                accountNumber, accountHolderName, balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("%s deposited $%.1f. New balance: $%.1f%n",
                    accountHolderName, amount, balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("%s withdrew $%.1f. New balance: $%.1f%n",
                    accountHolderName, amount, balance);
        }
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}



