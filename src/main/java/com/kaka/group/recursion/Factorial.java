package com.kaka.group.recursion;

public class Factorial {

    public static void main(String args[]){

       int k = getFact(5);
       System.out.println(" k ==>" +k);

    }
    /*
    1. base condition
        lets get in to process
        i =5; we should get answer 120

        f(0) = 1
        f(1) = 1 * f(0)  ====> 1 * 1
        f(2) = 2 * f(1)  ====> 2 * 1
        f(3) = 3 * f(2)  ====> 3 * 2
        f(4) = 4 * f(3)  ====> 4 * 6
        f(5) = 5 * f(4)  ====> 5 * 24 = 120

     */
    public static int getFact(int i){

        if(i == 0){
            return 1;
        }

        return i * getFact(i - 1);

    }
}
