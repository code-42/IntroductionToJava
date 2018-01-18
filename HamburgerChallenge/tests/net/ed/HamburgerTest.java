package net.ed;

import org.junit.Test;

import static org.junit.Assert.*;

public class HamburgerTest {

    Hamburger basicBurger = new Hamburger("Basic Burger", "ham", "Regular white bun", 5.55);

    String expected, actual;

    @Test
    public void Hamburger() {
        expected = "Basic Burger";
        actual = basicBurger.getName();
        assertEquals(expected, actual);

        expected = "ham";
        actual = basicBurger.getMeat();
        assertEquals(expected, actual);

        expected = "Regular white bun";
        actual = basicBurger.getBread();
        assertEquals(expected, actual);


        double expectedPrice, actualPrice;
        expectedPrice = 5.55;
        actualPrice = basicBurger.getPrice();
        assertEquals(expectedPrice, actualPrice, 0);
    }


}