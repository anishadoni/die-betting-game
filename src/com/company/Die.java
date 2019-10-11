package com.company;
import java.security.SecureRandom;

public class Die {
    private SecureRandom rand;

    public Die() {
        rand = new SecureRandom();

    }

    public int roll() {
        return rand.nextInt(6) + 1;
    }
}
