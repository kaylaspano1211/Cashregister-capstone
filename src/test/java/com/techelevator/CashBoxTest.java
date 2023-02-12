package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CashBoxTest {

    private CashBox cashBox;
    private Candy candy;




    @Before
    public void setUp(){

        cashBox = new CashBox();

    }



    @Test
    public void test_add_money_to_balance(){

        Assert.assertEquals(50, cashBox.addMoney(50));
        Assert.assertEquals(500, cashBox.addMoney(450));
        Assert.assertEquals(1000, cashBox.addMoney(500));
        Assert.assertNotEquals(1001, cashBox.addMoney(1));
        Assert.assertNotEquals(2001, cashBox.addMoney(1001));

    }

    @Test
    public void test_updated_balance_money_from_updated_balance_sour(){

        candy = new Candy("S1", "Gummy Ants", .10, 2, false, "Sour Flavored Candies");
        Assert.assertEquals(cashBox.getBalance(), cashBox.updatedBalance(candy, candy.getQty()), 0.00);
        Assert.assertEquals(0.0, cashBox.updatedBalance(candy, 101), 0.00);
        Assert.assertNotEquals(10.0, cashBox.updatedBalance(candy, 2), 0.0);
        Assert.assertEquals(0.20, cashBox.updatedBalance(candy, 2), 0.20);



    }

    @Test
    public void test_updated_balance_money_from_updated_balance_chocolate() {

        candy = new Candy("C1", "Snuckers Bar", 1.35, 20, true, "Chocolate Confectionery");
        Assert.assertEquals(cashBox.getBalance(), cashBox.updatedBalance(candy, candy.getQty()), 0.00);
        Assert.assertEquals(0.0, cashBox.updatedBalance(candy, 101), 0.00);
        Assert.assertNotEquals(10.0, cashBox.updatedBalance(candy, 2), 0.0);
        Assert.assertEquals(cashBox.getBalance(), cashBox.updatedBalance(candy, 2), 0.00);

    }

    @Test
    public void test_updated_balance_money_from_updated_balance_hard_candy() {

        candy = new Candy("H1", "Jolly Cowboy", 2.35, 100, true, "Hard Tack Confectionery");
        Assert.assertEquals(cashBox.getBalance(), cashBox.updatedBalance(candy, candy.getQty()), 0.00);
        Assert.assertEquals(cashBox.getBalance(), cashBox.updatedBalance(candy, 2), 0.00);
        Assert.assertEquals(0.0, cashBox.updatedBalance(candy, 101), 0.00);
        Assert.assertNotEquals(10.0, cashBox.updatedBalance(candy, 2), 0.0);

    }

    @Test
    public void test_updated_balance_money_from_updated_balance_licorice() {

        candy = new Candy("L1", "Dracula Piller", 1.15, 50, false, "Licorice and Jellies");
        Assert.assertEquals(cashBox.getBalance(), cashBox.updatedBalance(candy, candy.getQty()), 0.00);
        Assert.assertEquals(0.0, cashBox.updatedBalance(candy, 101), 0.00);
        Assert.assertNotEquals(10.0, cashBox.updatedBalance(candy, 2), 0.0);
        Assert.assertEquals(cashBox.getBalance(), cashBox.updatedBalance(candy, 2), 0.00);
    }
}
