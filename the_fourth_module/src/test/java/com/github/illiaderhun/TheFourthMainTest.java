package com.github.illiaderhun;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheFourthMainTest {

    @Test
    public void add() {
        TheFourthMain theFirstMain = new TheFourthMain();
        int expected = 4;
        int actual = theFirstMain.div(6, 2);
        assertEquals(expected, actual);
    }
}