package net.ed;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    private String player = "Gronk";
    private int position = 1000;
    private int playerScore = 1500;

    @org.junit.Test
    public void displayHighScorePosition() {
        String expected = "Gronk" + " " + 1000;
        String actual = player + " " + position;
        System.out.println(player + " is in position " + position + " on the high score table");
        assertEquals(expected, actual);
    }

    @Test
    public void calculateHighScorePosition() {
        int expected = 1500;
        int actual = playerScore;
        assertEquals(expected, actual);
    }
}