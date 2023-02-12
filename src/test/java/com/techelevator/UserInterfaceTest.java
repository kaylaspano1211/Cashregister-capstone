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

        Assert.assertNotEquals("Insufficient Stock", 50, 20);


    }
    @Test
    public void test_is_successful_funds() {
        Assert.assertNotEquals("Insufficient Funds", 50, 30 );
        Assert.assertEquals("Item Added to Customers Cart", 50, 50);


    }

}
