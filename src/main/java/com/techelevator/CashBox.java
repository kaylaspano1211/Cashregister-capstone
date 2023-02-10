package com.techelevator;

public class CashBox {

    private double balance;

    public int addMoney(int money) {

        if (balance + money < 1000) {
            return (int)(balance = balance + money);

        } else if (balance >= 1000) {
            return (int) balance;
        }

        return (int) balance;


    }

    public double getBalance() {

        return balance;
    }

}
