package com.arash.ariani.string;

public class CharacterCounter {

    public int countOccurrencesTraditional(String inputString, char targetCharacter) {
        int count = 0;

        for (char ch : inputString.toCharArray()) {
            if (ch == targetCharacter) {
                count++;
            }
        }

        return count;
    }

    public long countOccurrencesJava8(String inputString, char targetCharacter) {
        return inputString.chars()
                .filter(ch -> ch == targetCharacter)
                .count();
    }
}
