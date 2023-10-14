package com.arash.ariani.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseLettersAndWordsTest {

    private final ReverseLettersAndWords reverser = new ReverseLettersAndWords();

    @Test
    public void testReverseLettersAndWordsTraditional() {
        String input = "Hello World Java Programming";
        String expected = "gnimmargorP avaJ dlroW olleH";
        assertEquals(expected, reverser.reverseLettersAndWordsTraditional(input));
    }

    @Test
    public void testReverseLettersAndWordsTraditionalWithEmptyInput() {
        String input = "";
        String expected = "";
        assertEquals(expected, reverser.reverseLettersAndWordsTraditional(input));
    }

    @Test
    public void testReverseLettersAndWordsModern() {
        String input = "Hello World Java Programming";
        String expected = "olleH dlroW avaJ gnimmargorP";
        assertEquals(expected, reverser.reverseLettersOfEachWordModern(input));
    }

    @Test
    public void testReverseLettersAndWordsModernWithEmptyInput() {
        String input = "";
        String expected = "";
        assertEquals(expected, reverser.reverseLettersOfEachWordModern(input));
    }
}
