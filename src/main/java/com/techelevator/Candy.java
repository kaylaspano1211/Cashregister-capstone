package com.techelevator;

public class Candy {

    private String id;
    private String name;
    private boolean iswrapped;
    private int qty;
    private double price;

    public Candy(String id, String name, boolean iswrapped, int qty, double price){
        this.id = id;
        this.name = name;
        this.iswrapped = iswrapped;
        this.qty = qty;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIswrapped() {
        return iswrapped;
    }

    public void setIswrapped(boolean iswrapped) {
        this.iswrapped = iswrapped;
    }


    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
