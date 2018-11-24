package com.github.illiaderhun;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheThirdMainTest {

    @Test
    public void sub() {
        TheThirdMain theThirdMain = new TheThirdMain();
        int expected = 6;
        int actual = theThirdMain.sub(2, 3);
        assertEquals(expected, actual);
    }
}