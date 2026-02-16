package zad5;

public record BankAccount(int accountNumber, double balance) {
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public BankAccount(int accountNumber) {
        this(accountNumber, 0.0);
    }
}
