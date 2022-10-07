package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class subtest {
    @Test
    void testAddition() {
        Calc c = new Calc();
        assertEquals(2, c.subtract(4,2));
    }
}
