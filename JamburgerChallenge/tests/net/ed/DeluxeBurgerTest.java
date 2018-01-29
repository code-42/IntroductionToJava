package net.ed;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeluxeBurgerTest {

    DeluxeBurger deluxeBurger = new DeluxeBurger("Bill's Deluxe Burger", "ham", "wheat", 5.00);

    @Test
    public void addItem() {
        deluxeBurger.addItem(new AdditionalItem("chips", 0));

    }
}