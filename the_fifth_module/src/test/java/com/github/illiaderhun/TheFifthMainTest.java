package com.github.illiaderhun;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheFifthMainTest {

    @Test
    public void pow() {
        TheFifthMain theFifthMain = new TheFifthMain();
        double expected = 8;
        double actual = theFifthMain.pow(2, 3);
        assertEquals(expected, actual, 1);
    }
}