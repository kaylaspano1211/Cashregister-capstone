package com.techelevator;

public class Chocolate extends Candy{

    public Chocolate(String id, String name, double price, boolean isWrapped) {
        super(id, name,price,isWrapped);
    }

    public String toString(){
        return this.getId() + " " + this.getName() + " " + this.isWrapped() + " " + this.getQty() + " " + this.getPrice();
    }



}
