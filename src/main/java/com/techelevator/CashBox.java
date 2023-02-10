package com.techelevator;

public class CashBox {

    private double balance;

    public double addMoney(int money) {
        balance = balance + money;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

}
