package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Candy> shoppingCart = new ArrayList<>();

    public void addCandyToCart(Candy candy) {
        shoppingCart.add(candy);
    }


}
