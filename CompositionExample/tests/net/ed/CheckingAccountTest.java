package net.ed;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckingAccountTest {

    CheckingAccount checking = new CheckingAccount("Ed", 100);
    SavingAccount saving  = new SavingAccount("Ed", 200);
    Customer customer1 = new Customer(checking, saving);

    @Test
    public void getAccountType() {
        String expected = "Checking Account";
        String actual = checking.getAccountType();
        assertEquals(expected, actual);
    }
}