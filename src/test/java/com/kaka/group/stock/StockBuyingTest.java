package com.kaka.group.stock;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StockBuyingTest {


    @Test
    public void testOne(){
      int x =  StockBuying.getMax(new int[]{7,1,5,3,6,4});
        assertEquals(5 ,x);
    }

    @Test
    public void testTwo(){
        int x =  StockBuying.getMax(new int[]{7,6,4,3,1});
        assertEquals(0 ,x);
    }
}
