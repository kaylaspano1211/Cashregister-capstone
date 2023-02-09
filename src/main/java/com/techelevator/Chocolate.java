package com.techelevator;

public class Chocolate extends Candy{

    public Chocolate(String id, String name, boolean iswrapped, double price) {
        super(id, name, iswrapped, price);
    }








    public String toString() {
        return "Id: " + this.getId() + " Name " + this.getName() + " Wrapper " + this.isIswrapped() + " QTY " + this.getQty() + " Price: $" + this.getPrice();
    }


}
