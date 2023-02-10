package com.techelevator;

public class CandyNotFoundException extends Exception{

    private String candyId;

    public String getCandyId() {
        return candyId;
    }

    public void setCandyId(String candyId) {
        this.candyId = candyId;
    }
}
