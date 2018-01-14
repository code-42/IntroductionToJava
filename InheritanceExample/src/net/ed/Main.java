package net.ed;

public class Main {

    public static void main(String[] args) {

        Account checking = new CheckingAccount("Ed", 0);
        checking.deposit(100.00);
        checking.withdraw(50.00);
        System.out.println(checking.getBalance());
    }
}
