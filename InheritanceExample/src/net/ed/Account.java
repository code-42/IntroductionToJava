package net.ed;

public class Account {
    private String accountHolder;
//    private double initialDeposit;

    private double depositAmount;
    private double withdrawalAmount;
    private double balance;

    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double depositAmount){
        this.balance = balance + depositAmount;
    }

    public void withdraw(double withdrawalAmount){
        this.balance = balance - withdrawalAmount;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }


}
