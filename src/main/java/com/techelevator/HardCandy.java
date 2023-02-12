package com.techelevator;

public class HardCandy extends Candy{

    private static final String HARD_CANDY_DESCRIPTION = "Hard Tack Confectionary";

    public HardCandy(String id, String name, double price, int qty, boolean iswrapped) {
        super(id, name,price,qty, iswrapped, HARD_CANDY_DESCRIPTION);
    }



}
