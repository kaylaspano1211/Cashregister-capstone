package com.techelevator;

public class Licorice extends Candy{

    public Licorice(String id, String name, double price, boolean iswrapped) {
        super(id, name,price, iswrapped);
    }







    public String toString() {
        return this.getId() + " " + this.getName() + " " + convert_boolean_to_string() + " " + this.getQty() + " " + this.getPrice();
    }
}
