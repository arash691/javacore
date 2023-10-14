package com.arash.ariani.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseLettersAndWords {
    public String reverseLettersAndWordsTraditional(String input) {
        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            StringBuilder reversedWord = new StringBuilder();
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reversedWord.append(words[i].charAt(j));
            }
            result.append(reversedWord).append(" ");
        }

        return result.toString().trim();
    }

    public String reverseLettersOfEachWordModern(String input) {
        return Arrays.stream(input.split("\\s+"))
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
    }
}
