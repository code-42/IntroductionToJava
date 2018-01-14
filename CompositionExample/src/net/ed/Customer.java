package net.ed;

public class Customer {

    private CheckingAccount checking;
    private SavingAccount saving;

    public Customer(CheckingAccount checking, SavingAccount saving) {
        this.checking = checking;
        this.saving = saving;
    }
}
