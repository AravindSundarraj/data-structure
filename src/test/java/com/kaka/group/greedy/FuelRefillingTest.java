package com.kaka.group.greedy;

import org.junit.Test;
import org.junit.runner.RunWith;

import static com.kaka.group.greedy.FuelRefilling.getAdded;
import static com.kaka.group.greedy.FuelRefilling.reFilling;
import static org.junit.Assert.assertEquals;


public class FuelRefillingTest {


    @Test
    public void fuelTestOne(){

        int[] o =  new int[]{200, 375, 550, 750};
        int k = reFilling(950, 400,  o);
        assertEquals(2 , k);

    }

    @Test
    public void fuelTestTwo(){
        int[] o =  new int[]{1, 2, 5, 9};
        int k = reFilling(10, 3,  o);
        assertEquals(-1 , k);

    }

    @Test
    public void fuelTestThree(){

        int[] o =  new int[]{100, 150};
        int k = reFilling(200, 250,  o);
        assertEquals(0 , k);
    }

    @Test
    public void fuelTestFour(){

        int[] ooo =  new int[]{100, 200, 300, 400};

        int k = reFilling(700, 200,  ooo);
        assertEquals(-1 , k);
    }

    @Test
    public void fuelTestFive(){

        int[] o =  new int[]{1 ,2 ,4 ,5 ,6, 7, 8, 10, 11 };

        int k = reFilling(12, 3,  o);
        assertEquals(4 , k);
    }

    @Test
    public void fuelTestSix(){

        int[] o =  new int[]{100, 200, 300, 400};

        int k = reFilling(500, 200,  o);
        assertEquals(2 , k);

    }

    @Test
    public void fuelTestSeven(){

        int[] o =  new int[]{100 ,150};

        int k = reFilling(200, 250,  o);
        assertEquals(0 , k);
    }

    @Test
    public void fuelTestEight(){

        int[] o =  new int[]{100 ,150};

        int k = reFilling(250, 240,  o);
        assertEquals(1 , k);
    }

    @Test
    public void fuelTestNine(){

        int[] o =  new int[]{100 ,150};

        int k = reFilling(450, 240,  o);
        assertEquals(-1 , k);
    }

    @Test
    public void fuelTestTen(){
        int[] o =  new int[]{250};

        int k = reFilling(450, 340,  o);
        assertEquals(1 , k);
    }



    @Test
    public void fuelTest11(){
        int[] o =  new int[]{400 ,400 ,400, 200,200,400};

        int k = reFilling(100000, 400,  o);
        assertEquals(-1 , k);
    }

    @Test
    public void fuelTest12(){
        int[] o =  new int[]{25 ,50 ,75};

        int k = reFilling(100, 25,  o);
        assertEquals(3 , k);
    }

    @Test
    public void fuelTest13(){
        int[] o =  new int[]{1};

        int k = reFilling(2, 1,  o);
        assertEquals(1 , k);
    }

    @Test
    public void fuelTest14(){
        int[] o =  new int[]{7 ,15};

        int k = reFilling(19, 7,  o);
        assertEquals(-1 , k);
    }

    @Test
    public void fuelTest15(){
        int[] o =  new int[]{1, 2, 3, 4};

        int k = reFilling(5, 1,  o);
        assertEquals(4 , k);
    }
}
