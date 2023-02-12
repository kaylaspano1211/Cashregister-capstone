package com.techelevator;

public class Sour extends Candy{

    private static final String SOUR_DESCRIPTION = "Flavored Candies";

    public Sour(String id, String name, double price, int qty, boolean iswrapped) {
        super(id, name, price, qty, iswrapped, SOUR_DESCRIPTION);
    }

}
