package com.techelevator;

public class CashBox {

    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int addMoney(int money) {

        if (balance + money <= 1000) {
            return (int)(balance = balance + money);

        } else if (balance >= 1000) {
            return (int) balance;
        }

        return (int) balance;
    }


    public int subtractMoney(int money) {
        this.balance = this.balance - money;
        return (int)balance;
    }

    public int updatedBalance(Candy candy, int qty) {
        if (qty > candy.getQty()){
            return (int)balance;
        }
        else if (balance < candy.getPrice() * qty) {
            return (int)balance;
        } else {
            this.balance = this.balance - candy.getPrice()*qty;
            return (int)(balance);
        }
    }


    public double getBalance() {

        return balance;
    }

}
