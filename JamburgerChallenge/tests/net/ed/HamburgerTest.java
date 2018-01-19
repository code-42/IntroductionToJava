package net.ed;

import org.junit.Test;

import static org.junit.Assert.*;

public class HamburgerTest {

    Hamburger basicBurger = new Hamburger("Bill's Basic Burger", "ham", "wheat", 5.00);

    @Test
    public void getOrder() {
        String expected = "Bill's Basic Burger ham wheat 5.0";
        String actual = basicBurger.getOrder();
        assertEquals(expected, actual);
    }
}