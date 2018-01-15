package net.ed;

import org.junit.Test;

import static org.junit.Assert.*;

public class HamburgerTest {

    Hamburger basicBurger = new Hamburger("Basic Burger", "ham", "wheat", 5.00);

    @Test
    public void getOrder() {
        String expected = "Basic Burger ham wheat 5.00";
        String actual = basicBurger.getOrder();
        assertEquals(expected, actual);
    }
}