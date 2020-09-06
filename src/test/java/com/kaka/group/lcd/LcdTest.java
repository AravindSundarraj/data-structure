package com.kaka.group.lcd;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LcdTest {

    @Test
    public void testOne(){
        long lcm = Lcm.lcm(6 , 8);
        assertEquals(24 , lcm);
    }

    @Test
    public void testTwo(){
        long lcm = Lcm.lcm(761457 , 614573);
        assertEquals(467970912861l , lcm);
    }
}
