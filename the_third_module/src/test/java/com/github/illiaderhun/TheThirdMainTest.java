package com.github.illiaderhun;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheThirdMainTest {

    @Test
    public void add() {
        TheThirdMain theFirstMain = new TheThirdMain();
        int expected = 5;
        int actual = theFirstMain.sub(2, 2);
        assertEquals(expected, actual);
    }
}