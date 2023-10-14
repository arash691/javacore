package com.arash.ariani.string;

public class StringMasker {
    public String maskSensitiveInfo(String input, int visibleChars) {
        // Check if the input is not null and has a valid length
        if (input != null && input.length() > visibleChars) {
            int maskedLength = input.length() - visibleChars;
            StringBuilder maskedString = new StringBuilder();

            // Append asterisks for the masked part
            maskedString.append("*".repeat(Math.max(0, maskedLength)));

            // Append the last visibleChars characters
            maskedString.append(input.substring(maskedLength));

            return maskedString.toString();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
