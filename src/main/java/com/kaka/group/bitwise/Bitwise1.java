package com.kaka.group.bitwise;

public class Bitwise1 {

    /* AND
            8 4 2 1
        8 = 1 0 0 0
        6 = 0 1 1 0
        -------------
            0  0 0 0    = 0

       OR
          8 4 2 1
          1 0 0 0
          0 1 1 0
         -----------
          1 1 1 0      =  14

        XOR

        8 4 2 1
        1 0 0 0
        0 1 1 0
        --------
        1 1 1 0  = 14

        COMPLEMENT

        8 4 2 1
        1 0 0 0  = 0 1 1 1 = 7

     */

    public static void main(String args[]){
        //bitwise AND &
        int i = 8 & 6;
        System.out.println(i);

        //bitwise OR |
        int k = 8 | 6;
        System.out.println(k);

        // bitwise XOR ^
        int x = 8 ^ 6;
        System.out.println(x);

        int n = 8;
        int nn = ~n;
        System.out.println(nn);

    }
}
