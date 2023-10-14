package com.arash691.string;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterCounterTest {

    @Test
    public void testCountOccurrencesTraditional() {
        CharacterCounter characterCounter = new CharacterCounter();
        String inputString = "programming";
        char targetCharacter = 'g';

        int expectedOccurrences = 2;

        int actualOccurrences = characterCounter.countOccurrencesTraditional(inputString, targetCharacter);

        assertEquals(expectedOccurrences, actualOccurrences);
    }

    @Test
    public void testCountOccurrencesTraditionalNoMatch() {
        CharacterCounter characterCounter = new CharacterCounter();
        String inputString = "programming";
        char targetCharacter = 'z';  // Character not present in the string

        int expectedOccurrences = 0;

        int actualOccurrences = characterCounter.countOccurrencesTraditional(inputString, targetCharacter);

        assertEquals(expectedOccurrences, actualOccurrences);
    }

    @Test
    public void testCountOccurrencesJava8() {
        CharacterCounter characterCounter = new CharacterCounter();
        String inputString = "programming";
        char targetCharacter = 'g';

        long expectedOccurrences = 2;

        long actualOccurrences = characterCounter.countOccurrencesJava8(inputString, targetCharacter);

        assertEquals(expectedOccurrences, actualOccurrences);
    }

    @Test
    public void testCountOccurrencesJava8NoMatch() {
        CharacterCounter characterCounter = new CharacterCounter();
        String inputString = "programming";
        char targetCharacter = 'z';  // Character not present in the string

        long expectedOccurrences = 0;

        long actualOccurrences = characterCounter.countOccurrencesJava8(inputString, targetCharacter);

        assertEquals(expectedOccurrences, actualOccurrences);
    }
}
