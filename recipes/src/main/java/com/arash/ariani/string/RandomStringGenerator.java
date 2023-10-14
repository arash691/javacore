package com.arash.ariani.string;

import java.util.Random;

public class RandomStringGenerator {
    public String generateRandomString(int length) {
        if(length < 0){
            throw new IllegalStateException();
        }
        // Define the characters that can be used in the random string
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // Initialize a random object
        Random random = new Random();

        // Create a StringBuilder to store the random string
        StringBuilder randomString = new StringBuilder(length);

        // Generate each character of the random string
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            randomString.append(randomChar);
        }

        return randomString.toString();
    }
}
