package com.kaka.group.gcd;

//Euclidean Algorithm
/*
Euclidean Algorithm one of the oldest Algorithm to identify Greatest Common Divisor

 */
public class GreatestCommonDivisor {


    public static void main(String args[]) {

        int i = 2000000000 % 1;
        System.out.println("The i  ==" + i);
        long o = reminder(2000000000, 1);
        System.out.println("GCD =====>>" + o);

    }

    public static long reminder(long s1, long s2) {

        if (s1 == 0 || s2 == 0) return 0;
        if (s1 == s2) return s1;
        long k, s, r = 1, temp = s2;
        boolean flag = true;
        /*if(s1 > s2) {*/
        k = s1;
        s = s2;
        /*}
            else{
                k = s2;
                s = s1;
            }*/
        while (flag) {
            r = k % s;
            if (r != 0) {
                temp = r;
                k = s;
                s = r;
            } else {
                flag = false;

            }
        }

        return temp;
    }
}
