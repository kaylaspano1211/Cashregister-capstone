package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CashBoxTest {

    private CashBox cashBox;


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


}
