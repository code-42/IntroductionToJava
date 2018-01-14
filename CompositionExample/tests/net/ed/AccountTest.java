package net.ed;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

<<<<<<< HEAD
    CheckingAccount checking = new CheckingAccount("Ed", 100);
    SavingAccount saving  = new SavingAccount("Ed", 200);
    Customer customer1 = new Customer(checking, saving);

    @Test
    public void deposit() {
        checking.deposit(100.00);
=======
    @Test
    public void deposit() {
>>>>>>> composition_example
    }

    @Test
    public void withdraw() {
    }

    @Test
    public void getAccountHolder() {
    }

    @Test
    public void getBalance() {
    }
}