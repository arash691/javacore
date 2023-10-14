package com.arash.ariani.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RandomStringUtilTest {

    private final RandomStringGenerator generateRandomString = new RandomStringGenerator();
    @Test
    public void testGenerateRandomStringWithValidLength() {
        int length = 10;

        // Generate a random string
        String randomString = generateRandomString.generateRandomString(length);

        // Check if the generated string has the correct length
        assertEquals(length, randomString.length());
    }

    @Test
    public void testGenerateRandomStringWithZeroLength() {
        int length = 0;

        // Generate a random string with zero length
        String randomString = generateRandomString.generateRandomString(length);

        // Check if the generated string is empty
        assertTrue(randomString.isEmpty());
    }

    @Test
    public void testGenerateRandomStringWithNegativeLength() {
        int length = -5;

        assertThrows(IllegalStateException.class, () -> generateRandomString.generateRandomString(length));

    }

    @Test
    public void testGenerateRandomStringContainsValidCharacters() {
        int length = 15;

        // Generate a random string
        String randomString = generateRandomString.generateRandomString(length);

        // Check if the generated string contains only valid characters
        assertTrue(randomString.matches("[a-zA-Z0-9]+"));
    }
}
