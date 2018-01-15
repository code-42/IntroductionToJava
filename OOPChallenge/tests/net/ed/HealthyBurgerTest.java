package net.ed;

import org.junit.Test;

import static org.junit.Assert.*;

public class HealthyBurgerTest extends Hamburger{

    @Test
    public void addItems() {
        String expected = hamburger.addItems();
        String actual = hamburger.addItems();
        assertEquals(expected, actual);
    }
}