package com.arash691.string;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicates {

    public Map<Character, Integer> countDuplicatesTraditional(String inputString) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : inputString.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        return charCountMap;
    }

    public Map<Character, Long> countDuplicateCharacters(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

    }
}

