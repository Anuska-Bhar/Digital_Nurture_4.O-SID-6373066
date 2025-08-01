package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyMathTest {

    @Test
    public void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result);
    }

    @Test
    public void testMultiplication() {
        int result = 4 * 5;
        assertEquals(20, result);
    }
}
