package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    private final MathUtils math = new MathUtils();

    @Test
    void testAdd() {
        assertEquals(5, math.add(2, 3));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> math.divide(10, 0));
    }
}