package net.ed;

public class CheckingAccount extends Account {

    private String accountType = "Checking Account";

    public CheckingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    public String getAccountType() {
        return accountType;
    }
}
