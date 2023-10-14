package com.arash691.string;


import java.util.Objects;

public class DigitCheck {
    public boolean containsOnlyDigitsTraditional(String input) {
        if (input == null) {
            throw new NullPointerException("Input cannot be null");
        }
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean containsOnlyDigits(String input) {
        Objects.requireNonNull(input, "Input cannot be null");
        return input.chars().allMatch(Character::isDigit);
    }
}
