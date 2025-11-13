package zad5;

public record BankAccount(String numAcc, int balance) {
    public BankAccount(String numAcc, int balance) {
        this.numAcc = numAcc;
        this.balance = balance;
    }

    public BankAccount(String numAcc) {
        this(numAcc, 0);
    }
}
