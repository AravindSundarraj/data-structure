package com.kaka.group.recursion;

public class Fibbo {

    public static void main(String args[]){

      int l =  getFibo(5);

      System.out.println(l);

    }
    /*
       1. base condition
       2. let works on impl
       i = 5
        0 1 1 2 3 5
       f(0) = 1
       f(1) = 1
       f(2) = f(1) + f(0)
       f(3) = f(2) + f(1)
       f(4) = f(3) + f(2)
       f(5) = f(4) + f(3)

     */
    public static int getFibo(int i)
    {
        if(i == 0 || i == 1){
            return 1;
        }

        return getFibo(i - 1) + getFibo(i - 2);
    }
}
