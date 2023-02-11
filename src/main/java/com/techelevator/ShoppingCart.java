package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Candy> candyToBuy = new ArrayList<>();

    public void addToCart(Candy candyToAdd) {
        candyToBuy.add(candyToAdd);
    }

    public double getTotalPrice(int qty){
        double total = 0.0;
        for (Candy candy : candyToBuy){
            total += candy.getPrice()*qty;
        }
        return total;
    }

















}
