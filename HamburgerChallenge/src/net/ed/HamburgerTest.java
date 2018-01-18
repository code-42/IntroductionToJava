package net.ed;

import org.junit.Test;

import static org.junit.Assert.*;

public class HamburgerTest {

    Hamburger basicBurger = new Hamburger("Bill's Basic Burger", "ham", "Regular boring white bun", 5.00);

    @Test
    public void getName() {
        String expected = "Bill's Basic Burger";
        String actual = basicBurger.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void getMeat() {
        String expected = "ham";
        String actual = basicBurger.getMeat();
        assertEquals(expected, actual);
    }

    @Test
    public void getBread() {
        String expected = "Regular boring white bun";
        String actual = basicBurger.getBread();
        assertEquals(expected, actual);
    }

    @Test
    public void getPrice() {
        double expected = 5.55;
        double actual = basicBurger.getPrice();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void addHamburgerAddition1name() {
        basicBurger.addHamburgerAddition1("Bacon", 1.380);
        String expected = "Bacon";
        String actual = basicBurger.getAdditionalItem1Name();
        assertEquals(expected, actual);
    }

    @Test
    public void addHamburgerAddition1price() {
        basicBurger.addHamburgerAddition1("Bacon", 1.380);
        double expected = 1.380;
        double actual = basicBurger.getAdditionalItem1Price();
        assertEquals(expected, actual, 0);
    }


    @Test
    public void addHamburgerAddition2name() {
        basicBurger.addHamburgerAddition2("Cheeze", .25);
        String expected = "Cheeze";
        String actual = basicBurger.getAdditionalItem2Name();
        assertEquals(expected, actual);
    }

    @Test
    public void addHamburgerAddition2price() {
        basicBurger.addHamburgerAddition2("Cheeze", .25);
        double expected = .25;
        double actual = basicBurger.getAdditionalItem2Price();
        assertEquals(expected, actual, 0);
    }


    @Test
    public void addHamburgerAddition3name() {
        basicBurger.addHamburgerAddition3("Lettuce", .25);
        String expected = "Lettuce";
        String actual = basicBurger.getAdditionalItem3Name();
        assertEquals(expected, actual);
    }

    @Test
    public void addHamburgerAddition3price() {
        basicBurger.addHamburgerAddition3("Lettuce", .25);
        double expected = .25;
        double actual = basicBurger.getAdditionalItem3Price();
        assertEquals(expected, actual, 0);
    }


    @Test
    public void addHamburgerAddition4name() {
        basicBurger.addHamburgerAddition4("Tomato", .25);
        String expected = "Tomato";
        String actual = basicBurger.getAdditionalItem4Name();
        assertEquals(expected, actual);
    }

    @Test
    public void addHamburgerAddition4price() {
        basicBurger.addHamburgerAddition4("Tomato", .25);
        double expected = .25;
        double actual = basicBurger.getAdditionalItem4Price();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void itemizeHamburger() {
        basicBurger.addHamburgerAddition1("Bacon", 1.25);
        basicBurger.addHamburgerAddition2("Cheeze", .25);
        basicBurger.addHamburgerAddition3("Lettuce", .25);
//        basicBurger.addHamburgerAddition4("Tomato", .25);
//        System.out.println("Total price: $" + basicBurger.itemizeHamburger());

        double expected = 6.75;
        double actual = basicBurger.itemizeHamburger();
        assertEquals(expected, actual, 0);
    }
}