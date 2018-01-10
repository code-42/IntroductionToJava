package net.ed;

import static org.junit.Assert.*;

public class MainTest {

    private String player = "Me";
    private int position = 1;

    @org.junit.Test
    public void displayHighScorePosition() {
        String expected = player + " " + position;
        String actual = player + " " + position;
        assertEquals(expected, actual);
    }
}