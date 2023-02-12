package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InventoryTest {

    Inventory inventory;

    @Before
    public void setUp(){
        inventory = new Inventory();
    }

    @Test
    public void test_retrieve_candy_ID(){

        String result = "C1";
        String result2 = "C5";
        String result3 = "L3";
        Assert.assertEquals("C1",result);
        Assert.assertEquals("C5", result2);
        Assert.assertEquals("L3", result3);
        Assert.assertNotEquals("L1", result3);

    }








}
