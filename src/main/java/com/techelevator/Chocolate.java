package com.techelevator;

public class Chocolate extends Candy{

    public Chocolate(String id, String name, double price, boolean isWrapped) {
        super(id, name,price,isWrapped);
    }

    public String toString(){


        return this.getId() + " " + this.getName() + " " + convert_boolean_to_string() + " " + this.getQty() + " " + this.getPrice();
    }



}
