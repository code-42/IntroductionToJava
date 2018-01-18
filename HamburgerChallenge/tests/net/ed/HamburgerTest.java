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

        expected = "hamm";
        actual = basicBurger.getMeat();
        assertEquals(expected, actual);
    }


}