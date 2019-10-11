package com.company;

public class Main {

    public static void main(String[] args) {
	    Die d = new Die();

	    for (int i = 0; i < 100; i++) {
	        System.out.println(d.roll());
        }
    }
}
