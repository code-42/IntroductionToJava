package net.ed.Tests;

import net.ed.HeavenlyBody;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class HeavenlyBodyTest {

    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    @org.junit.Test
    public void getName() {
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        String expected = "Mercury";
        String actual = temp.getName();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void getOrbitalPeriod() {
        fail("this test not implemented yet");
    }

    @org.junit.Test
    public void addMoon() {
        fail("this test not implemented yet");
    }

    @org.junit.Test
    public void getSatellites() {
        fail("this test not implemented yet");
    }
}