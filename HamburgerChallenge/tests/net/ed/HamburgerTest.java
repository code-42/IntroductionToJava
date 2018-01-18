package net.ed;

import org.junit.Test;

import static org.junit.Assert.*;

public class HamburgerTest {

    Hamburger basicBurger = new Hamburger("Basic Burger", "ham", "Regular white bun", 5.55);

    @Test
    public void Hamburger() {
        String expected = "Basic Burger";
        String actual = basicBurger.getName();
        assertEquals(expected, actual);
    }
}