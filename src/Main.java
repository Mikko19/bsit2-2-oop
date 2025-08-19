public class Main {
    public static void main(String[] args) {
        System.out.println("Bank Name: " + BankAccount.bankName);
        System.out.printf("Interest Rate: %.1f%%%n%n", BankAccount.interestRate * 100);

        BankAccount acc1 = new BankAccount("John Doe", 1000.0);
        BankAccount acc2 = new BankAccount("Jane Smith", 2500.0);
        BankAccount acc3 = new BankAccount("Bob Johnson", 500.0);

        System.out.println("\n═══ Account Operations ═══");
        acc1.deposit(500.0);
        acc2.withdraw(300.0);

        System.out.println("\n═══ Interest Calculation ═══");
        System.out.printf("%s's interest: $%.1f%n", acc1.getAccountHolderName(), acc1.calculateInterest());
        System.out.printf("%s's interest: $%.1f%n", acc2.getAccountHolderName(), acc2.calculateInterest());
        System.out.printf("%s's interest: $%.1f%n", acc3.getAccountHolderName(), acc3.calculateInterest());

        System.out.printf("%nTotal Accounts Created: %d%n", BankAccount.totalAccounts);
    }
}
