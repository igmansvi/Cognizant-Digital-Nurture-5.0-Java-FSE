package com.javafse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AssertionsTest {
    @Test
    public void assertionsTest() {
        // Asserts Equals 5 == (3 + 2)
        assertEquals(5, 3 + 2);

        // Assert Tree 5 > 3
        assertTrue(5 > 3);

        // Assert False 5 < 3
        assertFalse(5 < 3);

        // Assert Null
        assertNull(null);

        // Assert Not Null
        assertNotNull(new Object());
    }
}