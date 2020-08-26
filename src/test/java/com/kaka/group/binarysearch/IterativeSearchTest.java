package com.kaka.group.binarysearch;

import org.junit.Test;

import static com.kaka.group.binarysearch.IterativeSearch.findValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IterativeSearchTest {

    @Test
    public void testOne(){

       boolean flag =  findValue(new int[]{3 , 5 , 8, 10, 12, 15, 18,20,20,50,60} , 50);
        assertTrue(flag);
    }
}
