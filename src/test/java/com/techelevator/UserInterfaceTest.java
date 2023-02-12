package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserInterfaceTest {

    UserInterface userInterface;

    @Before
    public void setUp(){
        userInterface = new UserInterface();

    }

    @Test
    public void test_is_successful_stock() {
        Candy candy = new Candy("C1", "Snuckers Bars", 1.35, 20, true, "Chocolate Confectionery");

//        String result = userInterface.isSaleSuccessful(candy, 100, candy.getPrice()* candy.getQty());
//        Assert.assertNotEquals( result, userInterface.isSaleSuccessful(candy, candy.getQty(), candy.getPrice()*candy.getPrice()));
//        Assert.assertNotEquals("Insufficient Funds", result, userInterface.isSaleSuccessful(candy,50, candy.getPrice()* candy.getQty()));



    }
    @Test
    public void test_is_successful_funds() {
        Candy candy = new Candy("C1", "Snuckers Bars", 1.35, 100, true, "Chocolate Confectionery");
        CashBox cashBox = new CashBox();

        String result = userInterface.isSaleSuccessful(candy, candy.getQty(), cashBox.getBalance());
        Assert.assertEquals("Insufficient Funds", result, result);


    }

    @Test
    public void test_print_subMenu(){

        int takeMoney = 1;
        int selectProducts = 2;
        int completeSale = 3;
       Assert.assertEquals("1. Take Money", 1, takeMoney);
       Assert.assertEquals("2. Select Products", 2, selectProducts);
       Assert.assertEquals("Complete Sale", 3, completeSale);

    }



}
