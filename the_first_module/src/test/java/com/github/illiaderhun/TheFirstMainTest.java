package com.github.illiaderhun;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheFirstMainTest {

    @Test
    public void add() {
        TheFirstMain theFirstMain = new TheFirstMain();
        int expected = 3;
        int actual = theFirstMain.add(2, 2);
        assertEquals(expected, actual);
    }
}