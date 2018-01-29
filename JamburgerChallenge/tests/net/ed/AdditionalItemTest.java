package net.ed;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionalItemTest {

    Hamburger basicBurger = new Hamburger("Bill's Basic Burger", "ham", "wheat", 5.00);

    @Test
    public void getItem() {
        basicBurger.addItem(new AdditionalItem("cheeze", .75));
//        basicBurger.addItem(new AdditionalItem("bacon", 1.75));
//        basicBurger.addItem(new AdditionalItem("mushrooms", .75));

        String expected = "cheeze";
        String actual = basicBurger.getOrder();
        assertEquals(expected, actual);
    }

    @Test
    public void getPrice() {
    }
}