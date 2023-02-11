package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {

    private List<Candy> candySelected = new ArrayList<>();


    public void addToCart(Candy candyToAdd, int qty) {
        candySelected.add(candyToAdd);
    }

    public double getTotalPrice(int qty){
        double total = 0.0;
        for (Candy candy : candySelected){
            total += candy.getPrice()*qty;
        }
        return total;
    }

    public List<Candy> getCandyToBuy() {
        return candySelected;
    }





    //    private Map<Candy,Integer> candyToBuy = new HashMap<>();
//    //Add qty, to the method to store both values
//    public void addToCandyTOCart(Candy candyToAdd, int qty) {
//        //we would likely need a Map.Entry
//        for (Map.Entry<Candy, Integer> candy : candyToBuy.entrySet()) {

//        }
//    }
















}
