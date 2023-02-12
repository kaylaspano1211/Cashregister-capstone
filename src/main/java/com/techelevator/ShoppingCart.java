package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {

    private List<Candy> candySelected = new ArrayList<>();


    public void addToCart(Candy candyToAdd, int qty) {
        // Making a new object that is a copy of the old one, to pass in from the App. Otherwise the original qty, would be changed everywhere.
        Candy copy = new Candy(candyToAdd.getId(), candyToAdd.getName(), candyToAdd.getPrice(), candyToAdd.getQty(), candyToAdd.isWrapped(), candyToAdd.getDescription());
        copy.setQty(qty);
        candySelected.add(copy);
    }

    public List<Candy> getCandyToBuy() {
        return candySelected;
    }

















}
