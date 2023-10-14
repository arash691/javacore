package com.arash691.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DigitCheckTest {

    private final DigitCheck digitChecker = new DigitCheck();
    @Test
    public void testContainsOnlyDigitsTraditional_WithDigits() {
        assertTrue(digitChecker.containsOnlyDigitsTraditional("12345"));
    }

    @Test
    public void testContainsOnlyDigitsTraditional_WithNonDigits() {
        assertFalse(digitChecker.containsOnlyDigitsTraditional("12345a"));
    }

    @Test
    public void testContainsOnlyDigitsTraditional_WithNullInput() {
        assertThrows(NullPointerException.class, () -> digitChecker.containsOnlyDigitsTraditional(null));
    }

    @Test
    public void testContainsOnlyDigits_WithDigits() {
        assertTrue(digitChecker.containsOnlyDigits("67890"));
    }

    @Test
    public void testContainsOnlyDigits_WithNonDigits() {
        assertFalse(digitChecker.containsOnlyDigits("67890b"));
    }

    @Test
    public void testContainsOnlyDigits_WithNullInput() {
        assertThrows(NullPointerException.class, () -> digitChecker.containsOnlyDigits(null));
    }
}
