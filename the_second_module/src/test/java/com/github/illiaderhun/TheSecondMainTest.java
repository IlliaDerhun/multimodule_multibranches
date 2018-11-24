package com.github.illiaderhun;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheSecondMainTest {

    @Test
    public void sub() {
        TheSecondMain theSecondMain = new TheSecondMain();
        int expected = 4;
        int actual = theSecondMain.sub(6, 2);
        assertEquals(expected, actual);
    }
}