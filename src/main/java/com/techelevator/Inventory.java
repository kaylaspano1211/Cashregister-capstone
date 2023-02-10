package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * This would be a GREAT place to keep track of our inventory. Hmmmm, we probably have seen something like this before
 */
public class Inventory {

    //Hint.. A constructor, might be a great place to call a InputFileReader class of some sort... Also a great place to
    // "encapsulate" some form of data structure to hold our items...

    //Also a great place to create methods that do things like look up a price for an item, retrieve a list of items, a specific item, look up availability of items, etc..


    private TreeMap<String, Candy> candy;

    public Inventory() {

        InventoryFileReader fr = new InventoryFileReader();
        candy = fr.readFile();

    }

    public List<Candy> retrieveCandyList() {

        List<Candy> candyList = new ArrayList<>();
        for (Map.Entry<String, Candy> entry : candy.entrySet()) {
            candyList.add(entry.getValue());
        }
        return candyList;
    }



    public Candy retrieveCandyId(String candyId) throws CandyNotFoundException {

        if (candy.get(candyId) == null) {
            CandyNotFoundException candyE = new CandyNotFoundException();
            candyE.setCandyId(candyId);
            throw candyE;

        } else {
            return candy.get(candyId);
        }

    }


}
