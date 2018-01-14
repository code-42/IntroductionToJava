package net.ed;

public class Main {

    public static void main(String[] args) {
	// write your code here

        CheckingAccount checking = new CheckingAccount("Ed", 100);
        SavingAccount saving  = new SavingAccount("Ed", 200);
        Customer customer1 = new Customer(checking, saving);
        checking.deposit(100.00);
        checking.withdraw(50.00);
        System.out.println(checking.getBalance());

        //TODO: make checks and interest
        // method to make an new customer


    }
}
