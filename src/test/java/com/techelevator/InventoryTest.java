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

        Assert.assertEquals("C1","C1");
        Assert.assertEquals("C5", "C5");
        Assert.assertNotEquals("L3", "L4");
        Assert.assertNotEquals("L2", "L1");

    }








}
