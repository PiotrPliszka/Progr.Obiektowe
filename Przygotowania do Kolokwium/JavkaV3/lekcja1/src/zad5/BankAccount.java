package zad5;

public record BankAccount(int accNumber, double balance) {

    public BankAccount(int accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public BankAccount(int accNumber) {
        this(accNumber, 0);
    }
}
