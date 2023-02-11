package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CashBoxTest {

    private CashBox cashBox;
    private Sour sour;
    private HardCandy hardCandy;
    private Chocolate chocolate;
    private Licorice licorice;



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
    public void test_subtract_money_from_updated_balance_sour(){

        sour = new Sour("S1", "Gummy Ants", .10, 2, false);
        Assert.assertEquals(cashBox.getBalance(), cashBox.updatedBalance(sour, sour.getQty()), 0.00);
        Assert.assertEquals(0.0, cashBox.updatedBalance(sour, 101), 0.00);
        Assert.assertNotEquals(10.0, cashBox.updatedBalance(sour, 2), 0.0);
        Assert.assertEquals(0.20, cashBox.updatedBalance(sour, 2), 0.20);



    }

    @Test
    public void test_subtract_money_from_updated_balance_chocolate() {

        chocolate = new Chocolate("C1", "Snuckers Bar", 1.35, 20, true);
        Assert.assertEquals(cashBox.getBalance(), cashBox.updatedBalance(chocolate, chocolate.getQty()), 0.00);
        Assert.assertEquals(0.0, cashBox.updatedBalance(chocolate, 101), 0.00);
        Assert.assertNotEquals(10.0, cashBox.updatedBalance(chocolate, 2), 0.0);
        Assert.assertEquals(cashBox.getBalance(), cashBox.updatedBalance(chocolate, 2), 0.00);

    }

    @Test
    public void test_subtract_money_from_updated_balance_hard_candy() {

        hardCandy = new HardCandy("H1", "Jolly Cowboy", 2.35, 100, true);
        Assert.assertEquals(cashBox.getBalance(), cashBox.updatedBalance(hardCandy, hardCandy.getQty()), 0.00);
        Assert.assertEquals(cashBox.getBalance(), cashBox.updatedBalance(hardCandy, 2), 0.00);
        Assert.assertEquals(0.0, cashBox.updatedBalance(hardCandy, 101), 0.00);
        Assert.assertNotEquals(10.0, cashBox.updatedBalance(hardCandy, 2), 0.0);

    }

    @Test
    public void test_subtract_money_from_updated_balance_licorice() {

        licorice = new Licorice("L1", "Dracula Piller", 1.15, 50, false);
        Assert.assertEquals(cashBox.getBalance(), cashBox.updatedBalance(licorice, licorice.getQty()), 0.00);
        Assert.assertEquals(0.0, cashBox.updatedBalance(licorice, 101), 0.00);
        Assert.assertNotEquals(10.0, cashBox.updatedBalance(licorice, 2), 0.0);
        Assert.assertEquals(cashBox.getBalance(), cashBox.updatedBalance(licorice, 2), 0.00);
    }
}
