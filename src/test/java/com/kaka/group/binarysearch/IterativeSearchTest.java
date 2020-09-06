package com.kaka.group.binarysearch;

import org.junit.Test;

import static com.kaka.group.binarysearch.IterativeSearch.findValue;
import static org.junit.Assert.*;

public class IterativeSearchTest {

    @Test
    public void testOne(){

       boolean flag =  findValue(new int[]{3 , 5 , 8, 10, 12, 15, 18,20,20,50,60} , 50);
        assertTrue(flag);
    }

    @Test
    public void testTwo(){

        boolean flag =  findValue(new int[]{3 , 5 , 8, 10, 12, 15, 18,20,20,50,60} , 65);
        assertTrue(flag);
    }

    @Test
    public void testThree(){

        boolean flag =  findValue(new int[]{3 , 5 , 8, 10, 12, 15, 18,20,20,50,60} , 60);
        assertTrue(flag);
    }

    @Test
    public void testFour(){

        boolean flag =  findValue(new int[]{3 , 5 , 8, 10, 12, 15, 18,20,20,50,60} , 0);
        assertFalse(flag);
    }
}
