package com.techelevator;

public abstract class Candy {

    private String id;
    private String name;
    private boolean isWrapped;
    private int qty = 100;
    private double price;

    public Candy(String id, String name, double price, boolean isWrapped){
        this.id = id;
        this.name = name;
        this.isWrapped = isWrapped;
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

    public boolean isWrapped() {
//        if(!isWrapped) {
//            return true;
//        } else if (isWrapped){
//        } return false;
        return true;
    }

    public void setWrapped(boolean wrapped) {
        this.isWrapped = wrapped;
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






    public abstract String toString();





}
