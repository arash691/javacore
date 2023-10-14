package com.arash.ariani.string;


import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountDuplicatesTest {

    @Test
    public void testCountDuplicatesTraditional() {
        CountDuplicates countDuplicates = new CountDuplicates();
        String inputString = "programming";
        Map<Character, Integer> expectedOutput = Map.of('p', 1, 'r', 2, 'o', 1, 'g', 2, 'a', 1, 'm', 2, 'i', 1, 'n', 1);

        Map<Character, Integer> actualOutput = countDuplicates.countDuplicatesTraditional(inputString);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testCountDuplicateCharacters() {
        CountDuplicates countDuplicates = new CountDuplicates();
        String inputString = "programming";
        Map<Character, Long> expectedOutput = Map.of('p', 1L, 'r', 2L, 'o', 1L, 'g', 2L, 'a', 1L, 'm', 2L, 'i', 1L, 'n', 1L);

        Map<Character, Long> actualOutput = countDuplicates.countDuplicateCharacters(inputString);

        assertEquals(expectedOutput, actualOutput);
    }
}
