package net.ed;

public class SavingAccount extends Account {

    private String accountType = "Saving Account";

    public SavingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    public String getAccountType() {
        return accountType;
    }
}
