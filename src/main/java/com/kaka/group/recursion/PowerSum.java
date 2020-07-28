package com.kaka.group.recursion;

public class PowerSum {

    static int count = 0;
    // X = 13 // N = 2
    public static void main(String args[]){

        int k = powerSum(100 , 2 ,1);


      System.out.println(k);
    }

    public static int powerSum(int X , int N , int y){

        int i_pow = (int)Math.pow(y, N);
        if (i_pow > X)
            return 0;
        else if (i_pow == X)
            return 1;
        // subproblem
        return powerSum(X,N,y+1) + powerSum(X-i_pow,N,y+1);
    }

    }



