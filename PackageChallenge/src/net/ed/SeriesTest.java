package net.ed;

import net.ed.mylibrary.Series;
import org.junit.Test;
import org.junit.Assert.*;


import static java.lang.Integer.*;
import static java.lang.Long.parseLong;
import static org.junit.Assert.*;

public class SeriesTest {

    @Test
    public void nSum() {
        // return (n * (n + 1)) /2;
        long expected = 6;
        long actual = Series.nSum(3);
        assertEquals(expected, actual);
    }

    @Test
    public void factorial() {
        // factorial(int n) : long
        long expected = 5;
        long actual = Series.factorial(3);
        assertEquals(expected, actual);
    }
}